package uk.gamesmith.runnerpal.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.FragmentScheduleBinding
import uk.gamesmith.runnerpal.schedule.item.ScheduleAdapter


class ScheduleFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentScheduleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, container, false)
        val adapter = ScheduleAdapter()
        val recycler = binding.scheduleRecycler
        recycler.adapter = adapter
        recycler.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        recycler.scrollToPosition(adapter.firstNotDone)
        return binding.root
    }

}