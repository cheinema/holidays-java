package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link NewYearsDay}.
 */
class NewYearsDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new NewYearsDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-01-01", "2018-01-01", "2019-01-01"
        );
    }
}
