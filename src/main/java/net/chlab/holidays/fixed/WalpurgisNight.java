package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Walpurgis Night" holiday that takes place every year on April 30th.
 */
public class WalpurgisNight extends AbstractFixedDayHoliday {

    private static final MonthDay APRIL_30TH = MonthDay.of(Month.APRIL, 30);

    public WalpurgisNight() {
        super(APRIL_30TH);
    }
}
