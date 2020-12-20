package com.pmacademy.razvii_pt8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


class MathBroadcastReceiver : BroadcastReceiver() {
    private val TAG = MathBroadcastReceiver::class.java.simpleName

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG, "MathBroadcastReceiver onReceive")
        val result = intent?.getDoubleExtra("math_result_to_receiver", 0.0)
        Log.d(TAG, "Receive extra: $result")

        val sendIntent = Intent()
        sendIntent.action = "receiver.to.activity.result"
        sendIntent.putExtra("math_result_to_fragment", result)
        context?.sendBroadcast(sendIntent)

    }
}