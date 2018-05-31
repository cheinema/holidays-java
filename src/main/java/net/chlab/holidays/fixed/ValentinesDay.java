package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Valentine's Day" holiday that takes place every year on February 14th.
 */
public class ValentinesDay extends AbstractFixedDayHoliday {

    private static final MonthDay FEBRUARY_14TH = MonthDay.of(Month.FEBRUARY, 14);

    public ValentinesDay() {
        super(FEBRUARY_14TH);
    }
}
