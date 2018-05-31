package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "All Saints' Day" holiday that takes place every year on November 1st.
 */
public class AllSaintsDay extends AbstractFixedDayHoliday {

    private static final MonthDay NOVEMBER_1ST = MonthDay.of(Month.NOVEMBER, 1);

    public AllSaintsDay() {
        super(NOVEMBER_1ST);
    }
}
