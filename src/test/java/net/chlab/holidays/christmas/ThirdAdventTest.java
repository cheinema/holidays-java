package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ThirdAdvent}.
 */
class ThirdAdventTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ThirdAdvent();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-12-16", "2019-12-15", "2020-12-13", "2021-12-12", "2022-12-11", "2023-12-17", "2024-12-15",
                "2025-12-14", "2026-12-13", "2027-12-12", "2028-12-17"
        );
    }
}
