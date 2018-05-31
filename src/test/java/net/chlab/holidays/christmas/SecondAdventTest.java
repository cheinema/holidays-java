package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link SecondAdvent}.
 */
class SecondAdventTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SecondAdvent();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-12-09", "2019-12-08", "2020-12-06", "2021-12-05", "2022-12-04", "2023-12-10", "2024-12-08",
                "2025-12-07", "2026-12-06", "2027-12-05", "2028-12-10"
        );
    }
}
