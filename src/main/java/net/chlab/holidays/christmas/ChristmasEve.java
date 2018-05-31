package net.chlab.holidays.christmas;

import net.chlab.holidays.fixed.AbstractFixedDayHoliday;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Christmas Eve" holiday, which is on December 24th each year.
 */
public class ChristmasEve extends AbstractFixedDayHoliday {

    public ChristmasEve() {
        super(MonthDay.of(Month.DECEMBER, 24));
    }
}
