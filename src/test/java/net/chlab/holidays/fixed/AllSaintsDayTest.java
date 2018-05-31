package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link AllSaintsDay}.
 */
class AllSaintsDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AllSaintsDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-11-01", "2018-11-01", "2019-11-01"
        );
    }
}
