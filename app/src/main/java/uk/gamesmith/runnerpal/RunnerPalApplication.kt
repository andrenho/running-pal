package uk.gamesmith.runnerpal

import android.app.Application
import timber.log.Timber

class RunnerPalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Timber.v("Timber initialized")
    }
}