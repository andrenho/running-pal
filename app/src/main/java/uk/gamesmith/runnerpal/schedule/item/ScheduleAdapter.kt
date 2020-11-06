package uk.gamesmith.runnerpal.schedule.item

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.FragmentScheduleBinding
import uk.gamesmith.runnerpal.databinding.ScheduleItemViewBinding
import uk.gamesmith.runnerpal.schedule.item.ScheduleItem
import uk.gamesmith.runnerpal.schedule.item.ScheduleItemViewHolder

class ScheduleAdapter : RecyclerView.Adapter<ScheduleItemViewHolder>() {
    val firstNotDone: Int
        get() {
            for ((i, item) in c25k.withIndex())
                if (!item.done)
                    return i;
            return 0;
        }

    lateinit var binding: ScheduleItemViewBinding

    val c25k = listOf(
        ScheduleItem(8, 60, 90, true),
        ScheduleItem(6, 120, 60, false),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ScheduleItemViewBinding.inflate(inflater)
        return ScheduleItemViewHolder(binding.root)
    }

    private fun timeToStr(seconds: Boolean, time: Int) : String {
        return if (seconds) { "${time}s" } else { "${time / 60}m" }
    }

    override fun onBindViewHolder(holder: ScheduleItemViewHolder, position: Int) {
        val item = c25k[position]
        val res = binding.root.resources
        val seconds = !((item.runTime % 60 == 0) && (item.walkTime % 60 == 0))

        binding.scheduleTitle.text = res.getString(R.string.day, position + 1)
        binding.scheduleDescription.text = res.getString(R.string.schedule_desc,
            timeToStr(seconds, item.runTime), item.runTimes, timeToStr(seconds, item.walkTime))

        if (item.done) {
            binding.scheduleTitle.paintFlags = (binding.scheduleTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG)
            binding.scheduleTitle.setTextColor(ContextCompat.getColor(binding.root.context, R.color.material_on_background_disabled))
            binding.scheduleDescription.paintFlags = (binding.scheduleDescription.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG)
        } else {
            binding.scheduleTitle.paintFlags = (binding.scheduleTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv())
            binding.scheduleTitle.setTextColor(ContextCompat.getColor(binding.root.context, R.color.black))
            binding.scheduleDescription.paintFlags = (binding.scheduleDescription.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv())
        }
    }

    override fun getItemCount(): Int {
        return c25k.size
    }
}