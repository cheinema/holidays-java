package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link WalpurgisNight}.
 */
class WalpurgisNightTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new WalpurgisNight();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-04-30", "2018-04-30", "2019-04-30"
        );
    }
}
