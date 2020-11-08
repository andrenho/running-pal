package uk.gamesmith.runnerpal.runner

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class RunnerViewModel : ViewModel() {
    enum class RunnerState { NOT_STARTED, EXECUTING, PAUSED, FINISHED }

    private var _state = MutableLiveData(RunnerState.NOT_STARTED)
    val state: LiveData<RunnerState>
        get() = _state

    fun onStart() {
        _state.value = RunnerState.EXECUTING
        Timber.i("State is now ${_state.value}")
    }

    fun onPause() {
        if (_state.value == RunnerState.EXECUTING)
            _state.value = RunnerState.PAUSED
        else
            _state.value = RunnerState.EXECUTING
    }

    fun onSkip() {

    }
}