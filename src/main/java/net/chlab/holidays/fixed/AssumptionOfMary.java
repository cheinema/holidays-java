package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Assumption of Mary" holiday that takes place every year on August 15th.
 */
public class AssumptionOfMary extends AbstractFixedDayHoliday {

    private static final MonthDay AUGUST_15TH = MonthDay.of(Month.AUGUST, 15);

    public AssumptionOfMary() {
        super(AUGUST_15TH);
    }
}
