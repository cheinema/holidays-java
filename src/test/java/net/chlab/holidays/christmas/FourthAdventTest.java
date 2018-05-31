package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link FourthAdvent}.
 */
class FourthAdventTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new FourthAdvent();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-12-23", "2019-12-22", "2020-12-20", "2021-12-19", "2022-12-18", "2023-12-24", "2024-12-22",
                "2025-12-21", "2026-12-20", "2027-12-19", "2028-12-24"
        );
    }
}
