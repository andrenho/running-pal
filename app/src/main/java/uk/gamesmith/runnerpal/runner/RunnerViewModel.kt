package uk.gamesmith.runnerpal.runner

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class RunnerViewModel : ViewModel() {
    enum class RunnerState { NOT_STARTED, EXECUTING, PAUSED, FINISHED }

    var state = MutableLiveData<RunnerState>(RunnerState.NOT_STARTED)

    fun onStart() {
        Timber.i("onStart")
    }

    fun onPause() {

    }

    fun onSkip() {

    }
}