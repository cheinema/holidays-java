package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "St. Martin's Day" holiday that takes place every year on November 11th.
 */
public class SaintMartinsDay extends AbstractFixedDayHoliday {

    private static final MonthDay NOVEMBER_11TH = MonthDay.of(Month.NOVEMBER, 11);

    public SaintMartinsDay() {
        super(NOVEMBER_11TH);
    }
}
