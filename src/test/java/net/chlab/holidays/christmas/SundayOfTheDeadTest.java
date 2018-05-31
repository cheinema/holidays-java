package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link SundayOfTheDead}.
 */
class SundayOfTheDeadTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SundayOfTheDead();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-11-25", "2019-11-24", "2020-11-22", "2021-11-21", "2022-11-20", "2023-11-26", "2024-11-24",
                "2025-11-23", "2026-11-22", "2027-11-21", "2028-11-26"
        );
    }
}
