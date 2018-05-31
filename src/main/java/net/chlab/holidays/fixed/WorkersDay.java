package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Workers' Day" holiday that takes place every year on May 1st.
 */
public class WorkersDay extends AbstractFixedDayHoliday {

    private static final MonthDay MAY_1ST = MonthDay.of(Month.MAY, 1);

    public WorkersDay() {
        super(MAY_1ST);
    }
}
