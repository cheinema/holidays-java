package net.chlab.holidays.christmas;

import net.chlab.holidays.fixed.AbstractFixedDayHoliday;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Second day of Christmas" holiday, which is on December 26th each year.
 */
public class SecondDayOfChristmas extends AbstractFixedDayHoliday {

    public SecondDayOfChristmas() {
        super(MonthDay.of(Month.DECEMBER, 26));
    }
}
