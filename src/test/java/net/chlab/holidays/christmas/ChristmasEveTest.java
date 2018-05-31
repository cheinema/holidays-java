package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ChristmasEve}.
 */
class ChristmasEveTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ChristmasEve();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-24", "2018-12-24", "2019-12-24"
        );
    }
}
