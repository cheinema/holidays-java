package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Reformation Day" holiday that takes place every year on October 31th.
 */
public class ReformationDay extends AbstractFixedDayHoliday {

    private static final MonthDay OCTOBER_31TH = MonthDay.of(Month.OCTOBER, 31);

    public ReformationDay() {
        super(OCTOBER_31TH);
    }
}
