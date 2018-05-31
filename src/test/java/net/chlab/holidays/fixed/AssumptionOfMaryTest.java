package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link AssumptionOfMary}.
 */
class AssumptionOfMaryTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AssumptionOfMary();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-08-15", "2018-08-15", "2019-08-15"
        );
    }
}
