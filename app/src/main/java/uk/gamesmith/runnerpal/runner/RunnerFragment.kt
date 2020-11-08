package uk.gamesmith.runnerpal.runner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import timber.log.Timber
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.FragmentRunnerBinding

class RunnerFragment : Fragment() {
    lateinit var binding: FragmentRunnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        val backPressedCallback = requireActivity().onBackPressedDispatcher.addCallback(this) {
            stopExecution()
        }
        backPressedCallback.isEnabled = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val runnerViewModel: RunnerViewModel by viewModels()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_runner, container, false)
        binding.runnerViewModel = runnerViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            stopExecution()
        return super.onOptionsItemSelected(item)
    }

    private fun stopExecution() {
        // requireActivity().supportFragmentManager.popBackStack() -- ???
    }
}