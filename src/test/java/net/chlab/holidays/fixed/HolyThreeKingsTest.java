package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link HolyThreeKings}.
 */
class HolyThreeKingsTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new HolyThreeKings();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-01-06", "2018-01-06", "2019-01-06"
        );
    }
}
