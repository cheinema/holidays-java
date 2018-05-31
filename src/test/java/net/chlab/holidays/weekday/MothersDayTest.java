package net.chlab.holidays.weekday;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link MothersDay}.
 */
class MothersDayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new MothersDay();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-13", "2019-05-12", "2020-05-10", "2021-05-09", "2022-05-08", "2023-05-14", "2024-05-12",
                "2025-05-11", "2026-05-10", "2027-05-09", "2028-05-14"
        );
    }
}
