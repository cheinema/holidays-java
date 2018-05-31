package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link ShroveTuesday}.
 */
class ShroveTuesdayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new ShroveTuesday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-02-13", "2019-03-05", "2020-02-25", "2021-02-16", "2022-03-01", "2023-02-21", "2024-02-13",
                "2025-03-04", "2026-02-17", "2027-02-09", "2028-02-29"
        );
    }
}
