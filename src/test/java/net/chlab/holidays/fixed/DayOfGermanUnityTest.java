package net.chlab.holidays.fixed;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link DayOfGermanUnity}.
 */
class DayOfGermanUnityTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new DayOfGermanUnity();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-10-03", "2018-10-03", "2019-10-03"
        );
    }
}
