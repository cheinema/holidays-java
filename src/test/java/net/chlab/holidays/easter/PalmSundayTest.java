package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link PalmSunday}.
 */
class PalmSundayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PalmSunday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-03-25", "2019-04-14", "2020-04-05", "2021-03-28", "2022-04-10", "2023-04-02", "2024-03-24",
                "2025-04-13", "2026-03-29", "2027-03-21", "2028-04-09"
        );
    }
}
