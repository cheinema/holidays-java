package net.chlab.holidays.weekday;

import net.chlab.holidays.Holiday;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * "Mother's Day" holiday that takes place on the 2nd sunday of May.
 */
public class MothersDay implements Holiday {

    private static MonthDay MAY_1ST = MonthDay.of(Month.MAY, 1);

    @Override
    public LocalDate atYear(Year year) {
        return year.atMonthDay(MAY_1ST).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
    }
}
