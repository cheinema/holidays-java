package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ChristmasDay}.
 */
class ChristmasDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ChristmasDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-25", "2018-12-25", "2019-12-25"
        );
    }
}
