package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link AugsburgsHighPeaceFestival}.
 */
class AugsburgsHighPeaceFestivalTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AugsburgsHighPeaceFestival();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-08-08", "2018-08-08", "2019-08-08"
        );
    }
}
