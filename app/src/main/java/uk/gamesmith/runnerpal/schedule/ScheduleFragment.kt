package uk.gamesmith.runnerpal.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import timber.log.Timber
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.FragmentScheduleBinding
import uk.gamesmith.runnerpal.schedule.item.ScheduleAdapter
import uk.gamesmith.runnerpal.schedule.item.ScheduleItem
import uk.gamesmith.runnerpal.util.ClickListener
import uk.gamesmith.runnerpal.util.RecyclerTouchListener


class ScheduleFragment : Fragment() {
    lateinit var binding: FragmentScheduleBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val data = listOf(
                ScheduleItem(8, 60, 90, true),
                ScheduleItem(6, 120, 60, false),
        )
        val nv = requireActivity().supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment

        val adapter = ScheduleAdapter()
        adapter.fullSchedule = data

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, container, false)
        binding.scheduleRecycler.apply {
            this.adapter = adapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            scrollToPosition(adapter.firstNotDone())
            addOnItemTouchListener(RecyclerTouchListener(context, this, object: ClickListener {
                override fun onClick(view: View?, position: Int) {
                    nv.navController.navigate(R.id.action_scheduleFragment_to_runnerFragment)
                }

                override fun onLongClick(view: View?, position: Int) {
                    Timber.i("longClick on ${position}")
                }
            }))
        }
        return binding.root
    }

}