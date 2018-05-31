package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Holy Three Kings" holiday that takes place every year on January 6th.
 */
public class HolyThreeKings extends AbstractFixedDayHoliday {

    private static final MonthDay JANUARY_6TH = MonthDay.of(Month.JANUARY, 6);

    public HolyThreeKings() {
        super(JANUARY_6TH);
    }
}
