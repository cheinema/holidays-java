package net.chlab.holidays.christmas;

import net.chlab.holidays.fixed.AbstractFixedDayHoliday;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Christmas Day" holiday, which is on December 25th each year.
 */
public class ChristmasDay extends AbstractFixedDayHoliday {

    public ChristmasDay() {
        super(MonthDay.of(Month.DECEMBER, 25));
    }
}
