package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "New Year's" holiday that takes place every year on January 1st.
 */
public class NewYearsDay extends AbstractFixedDayHoliday {

    private static final MonthDay JANUARY_1ST = MonthDay.of(Month.JANUARY, 1);

    public NewYearsDay() {
        super(JANUARY_1ST);
    }
}
