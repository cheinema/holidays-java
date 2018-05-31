package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link SaintNicholas}.
 */
class SaintNicholasTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SaintNicholas();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-06", "2018-12-06", "2019-12-06"
        );
    }
}
