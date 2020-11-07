package uk.gamesmith.runnerpal.schedule.item

import android.graphics.Paint
import android.view.View
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.ScheduleItemViewBinding

class ScheduleItemViewHolder(val binding: ScheduleItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
    private fun timeToStr(seconds: Boolean, time: Int) : String {
        return if (seconds) { "${time}s" } else { "${time / 60}m" }
    }

    fun setScheduleItem(item: ScheduleItem) {
        val res = binding.root.resources
        val seconds = !((item.runTime % 60 == 0) && (item.walkTime % 60 == 0))

        binding.apply {
            scheduleTitle.text = res.getString(R.string.day, position + 1)
            scheduleDescription.text = res.getString(R.string.schedule_desc,
                    timeToStr(seconds, item.runTime), item.runTimes, timeToStr(seconds, item.walkTime))

            if (item.done) {
                scheduleTitle.paintFlags = (binding.scheduleTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG)
                scheduleTitle.setTextColor(ContextCompat.getColor(binding.root.context, R.color.material_on_background_disabled))
                scheduleDescription.paintFlags = (binding.scheduleDescription.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG)
            } else {
                scheduleTitle.paintFlags = (binding.scheduleTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv())
                scheduleTitle.setTextColor(ContextCompat.getColor(binding.root.context, R.color.black))
                scheduleDescription.paintFlags = (binding.scheduleDescription.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv())
            }
        }
    }
}