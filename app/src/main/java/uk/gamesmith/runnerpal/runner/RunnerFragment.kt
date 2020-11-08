package uk.gamesmith.runnerpal.runner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.FragmentRunnerBinding

class RunnerFragment : Fragment() {
    lateinit var binding: FragmentRunnerBinding
    lateinit var viewModel: RunnerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate<FragmentRunnerBinding>(inflater, R.layout.fragment_runner, container, false)
        binding.runnerViewModel = ViewModelProvider(this).get(RunnerViewModel::class.java)
        return binding.root
    }

    fun onStartClick(view: View) {

    }
}