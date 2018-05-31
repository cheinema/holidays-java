package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ValentinesDay}.
 */
class ValentinesDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ValentinesDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-02-14", "2018-02-14", "2019-02-14"
        );
    }
}
