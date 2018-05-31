package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "New Year's Eve" holiday (aka "Saint Sylvester's Day") that takes place every year on December 31th.
 */
public class NewYearsEve extends AbstractFixedDayHoliday {

    private static final MonthDay DECEMBER_31TH = MonthDay.of(Month.DECEMBER, 31);

    public NewYearsEve() {
        super(DECEMBER_31TH);
    }
}
