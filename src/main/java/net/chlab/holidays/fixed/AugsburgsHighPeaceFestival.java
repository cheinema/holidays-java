package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Augsburg's High Peace Festival" holiday that takes place every year on August 8th.
 */
public class AugsburgsHighPeaceFestival extends AbstractFixedDayHoliday {

    private static final MonthDay AUGUST_8TH = MonthDay.of(Month.AUGUST, 8);

    public AugsburgsHighPeaceFestival() {
        super(AUGUST_8TH);
    }
}
