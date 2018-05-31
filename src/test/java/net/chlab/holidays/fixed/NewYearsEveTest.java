package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link NewYearsEve}.
 */
class NewYearsEveTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new NewYearsEve();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-31", "2018-12-31", "2019-12-31"
        );
    }
}
