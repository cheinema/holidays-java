package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link WorkersDay}.
 */
class WorkersDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new WorkersDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-05-01", "2018-05-01", "2019-05-01"
        );
    }
}
