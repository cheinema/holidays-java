package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * Abstract implementation of holidays relative to the first Advent. The first Advent is the sunday before December
 * 4th.
 */
public abstract class AbstractAdventRelativeHoliday implements Holiday {

    private static final MonthDay DECEMBER_4TH = MonthDay.of(12, 4);

    private final int daysToAdd;

    public AbstractAdventRelativeHoliday(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }

    @Override
    public LocalDate atYear(Year year) {
        return advent(year).plusDays(daysToAdd);
    }

    private LocalDate advent(Year year) {
        return year.atMonthDay(DECEMBER_4TH).with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
    }
}
