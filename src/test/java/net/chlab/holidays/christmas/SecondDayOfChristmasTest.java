package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link SecondDayOfChristmas}.
 */
class SecondDayOfChristmasTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SecondDayOfChristmas();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-26", "2018-12-26", "2019-12-26"
        );
    }
}
