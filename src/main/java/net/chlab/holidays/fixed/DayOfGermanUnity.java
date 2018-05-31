package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Day of German Unity" holiday that takes place every year on October 3rd.
 */
public class DayOfGermanUnity extends AbstractFixedDayHoliday {

    private static final MonthDay OCTOBER_3RD = MonthDay.of(Month.OCTOBER, 3);

    public DayOfGermanUnity() {
        super(OCTOBER_3RD);
    }
}
