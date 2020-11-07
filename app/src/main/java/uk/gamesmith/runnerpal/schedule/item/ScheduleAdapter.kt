package uk.gamesmith.runnerpal.schedule.item

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import uk.gamesmith.runnerpal.R
import uk.gamesmith.runnerpal.databinding.ScheduleItemViewBinding

class ScheduleAdapter() : RecyclerView.Adapter<ScheduleItemViewHolder>() {
    var fullSchedule : List<ScheduleItem> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    fun firstNotDone(): Int {
        for ((i, item) in fullSchedule.withIndex())
            if (!item.done)
                return i;
        return 0;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ScheduleItemViewHolder(ScheduleItemViewBinding.inflate(inflater))
    }

    override fun onBindViewHolder(holder: ScheduleItemViewHolder, position: Int) {
        val item = fullSchedule[position]
        holder.setScheduleItem(item)
    }

    override fun getItemCount(): Int {
        return fullSchedule.size
    }
}