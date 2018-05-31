package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link DayOfRepentanceAndPrayer}.
 */
class DayOfRepentanceAndPrayerTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new DayOfRepentanceAndPrayer();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-11-22", "2018-11-21", "2019-11-20", "2020-11-18", "2021-11-17", "2022-11-16", "2023-11-22",
                "2024-11-20", "2025-11-19", "2026-11-18", "2027-11-17"
        );
    }
}
