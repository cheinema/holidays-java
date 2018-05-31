package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ReformationDay}.
 */
class ReformationDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ReformationDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-10-31", "2018-10-31", "2019-10-31"
        );
    }
}
