package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link SaintMartinsDay}.
 */
class SaintMartinsDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SaintMartinsDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-11-11", "2018-11-11", "2019-11-11"
        );
    }
}
