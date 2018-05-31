package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Saint Nicholas" holiday that takes place every year on December 6th.
 */
public class SaintNicholas extends AbstractFixedDayHoliday {

    private static final MonthDay DECEMBER_6TH = MonthDay.of(Month.DECEMBER, 6);

    public SaintNicholas() {
        super(DECEMBER_6TH);
    }
}
