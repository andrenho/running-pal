package uk.gamesmith.runnerpal.repository

import uk.gamesmith.runnerpal.data.Program
import uk.gamesmith.runnerpal.data.Schedule
import uk.gamesmith.runnerpal.data.ScheduleDay

object ProgramRepository {
    fun getAll() : List<Program> {
        val lst = ArrayList<Program>()

        lst.add(Program(
                "Couch to 5K",
                "Couch to 5K is a running plan for absolute beginners. The plan involves 3 runs a week, with a day of rest inbetween, and a different schedule for each of the 9 weeks.",
                Schedule().apply {
                    // week 1
                    add(ScheduleDay(listOf(60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60)))
                    add(ScheduleDay(listOf(60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60)))
                    add(ScheduleDay(listOf(60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60, 90, 60)))
                    // week 2
                    add(ScheduleDay(listOf(90, 120, 90, 120, 90, 120, 90, 120, 90, 120, 90)))
                    add(ScheduleDay(listOf(90, 120, 90, 120, 90, 120, 90, 120, 90, 120, 90)))
                    add(ScheduleDay(listOf(90, 120, 90, 120, 90, 120, 90, 120, 90, 120, 90)))
                    // week 3
                    add(ScheduleDay(listOf(90, 90, 3 * 60, 3 * 60, 90, 90, 3 * 60)))
                    add(ScheduleDay(listOf(90, 90, 3 * 60, 3 * 60, 90, 90, 3 * 60)))
                    add(ScheduleDay(listOf(90, 90, 3 * 60, 3 * 60, 90, 90, 3 * 60)))
                    // week 4
                    add(ScheduleDay(listOf(3 * 60, 90, 5 * 60, 150, 3 * 60, 90, 5 * 60)))
                    add(ScheduleDay(listOf(3 * 60, 90, 5 * 60, 150, 3 * 60, 90, 5 * 60)))
                    add(ScheduleDay(listOf(3 * 60, 90, 5 * 60, 150, 3 * 60, 90, 5 * 60)))
                    // week 5
                    add(ScheduleDay(listOf(5 * 60, 3 * 60, 5 * 60, 3 * 60, 5 * 60)))
                    add(ScheduleDay(listOf(8 * 60, 5 * 60, 8 * 60)))
                    add(ScheduleDay(listOf(20 * 60)))
                    // week 6
                    add(ScheduleDay(listOf(5 * 60, 3 * 60, 8 * 60, 3 * 60, 5 * 60)))
                    add(ScheduleDay(listOf(10 * 60, 3 * 60, 10 * 60)))
                    add(ScheduleDay(listOf(22)))
                    // week 7
                    add(ScheduleDay(listOf(25)))
                    add(ScheduleDay(listOf(25)))
                    add(ScheduleDay(listOf(25)))
                    // week 8
                    add(ScheduleDay(listOf(28)))
                    add(ScheduleDay(listOf(28)))
                    add(ScheduleDay(listOf(28)))
                    // week 9
                    add(ScheduleDay(listOf(30)))
                    add(ScheduleDay(listOf(30)))
                    add(ScheduleDay(listOf(30)))
                }))

        lst.add(Program(
                "Ease into 10K",
                "For graduates of the C25K program who are looking to push it to the next level!",
                Schedule().apply {
                    add(ScheduleDay(listOf(3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60))) // week 1
                    add(ScheduleDay(listOf(3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60)))
                    add(ScheduleDay(listOf(3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60, 60, 3 * 60)))
                    add(ScheduleDay(listOf(4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60))) // week 2
                    add(ScheduleDay(listOf(4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60)))
                    add(ScheduleDay(listOf(4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60, 60, 4 * 60)))
                    add(ScheduleDay(listOf(5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60))) // week 3
                    add(ScheduleDay(listOf(5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60)))
                    add(ScheduleDay(listOf(5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60, 60, 5 * 60)))
                    add(ScheduleDay(listOf(8 * 60, 60, 8 * 60, 60, 8 * 60, 60, 8 * 60))) // week 4
                    add(ScheduleDay(listOf(8 * 60, 60, 8 * 60, 60, 8 * 60, 60, 8 * 60)))
                    add(ScheduleDay(listOf(8 * 60, 60, 8 * 60, 60, 8 * 60, 60, 8 * 60)))
                    add(ScheduleDay(listOf(9 * 60, 60, 9 * 60, 60, 9 * 60, 60, 9 * 60))) // week 5
                    add(ScheduleDay(listOf(9 * 60, 60, 9 * 60, 60, 9 * 60, 60, 9 * 60)))
                    add(ScheduleDay(listOf(9 * 60, 60, 9 * 60, 60, 9 * 60, 60, 9 * 60)))
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60, 60, 10 * 60))) // week 6
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60, 60, 10 * 60)))
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60, 60, 10 * 60)))
                    add(ScheduleDay(listOf(15 * 60, 60, 15 * 60, 60, 15 * 60))) // week 7
                    add(ScheduleDay(listOf(15 * 60, 60, 15 * 60, 60, 15 * 60)))
                    add(ScheduleDay(listOf(15 * 60, 60, 15 * 60, 60, 15 * 60)))
                    add(ScheduleDay(listOf(17 * 60, 60, 17 * 60, 60, 17 * 60))) // week 8
                    add(ScheduleDay(listOf(17 * 60, 60, 17 * 60, 60, 17 * 60)))
                    add(ScheduleDay(listOf(17 * 60, 60, 17 * 60, 60, 17 * 60)))
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60))) // week 9
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60)))
                    add(ScheduleDay(listOf(10 * 60, 60, 10 * 60, 60, 10 * 60)))
                    add(ScheduleDay(listOf(22 * 60, 60, 22 * 60))) // week 10
                    add(ScheduleDay(listOf(25 * 60, 60, 25 * 60)))
                    add(ScheduleDay(listOf(30 * 60, 60, 30 * 60)))
                }
        ))

        return lst
    }
}