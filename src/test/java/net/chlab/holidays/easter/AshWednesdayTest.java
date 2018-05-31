package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link AshWednesday}.
 */
class AshWednesdayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AshWednesday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-02-14", "2019-03-06", "2020-02-26", "2021-02-17", "2022-03-02", "2023-02-22", "2024-02-14",
                "2025-03-05", "2026-02-18", "2027-02-10", "2028-03-01"
        );
    }
}
