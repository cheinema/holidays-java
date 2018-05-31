package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.util.Objects;

/**
 * Abstract implementation of holidays with fixed {@link MonthDay}.
 */
public abstract class AbstractFixedDayHoliday implements Holiday {

    private final MonthDay monthDay;

    public AbstractFixedDayHoliday(MonthDay monthDay) {
        this.monthDay = Objects.requireNonNull(monthDay, "MonthDay must not be null");
    }

    @Override
    public LocalDate atYear(Year year) {
        return year.atMonthDay(monthDay);
    }
}
