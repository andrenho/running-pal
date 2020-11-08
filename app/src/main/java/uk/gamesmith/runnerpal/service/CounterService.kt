package uk.gamesmith.runnerpal.service

import android.app.Service
import android.content.Intent
import android.os.*
import timber.log.Timber

// TODO - see https://developer.android.com/guide/components/foreground-services

class CounterService : Service() {
    private var serviceLooper: Looper? = null
    private var serviceHandler: ServiceHandler? = null

    private inner class ServiceHandler(looper: Looper) : Handler(looper) {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
        }
    }

    override fun onCreate() {
        Timber.i("Creating service")
        HandlerThread("CounterService", Process.THREAD_PRIORITY_BACKGROUND).apply {
            start()
            serviceLooper = looper
            serviceHandler = ServiceHandler(looper)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Timber.i("Starting service")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null;
    }

    override fun onDestroy() {
        Timber.i("Destroying service")
    }
}