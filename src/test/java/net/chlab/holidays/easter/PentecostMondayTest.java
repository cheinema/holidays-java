package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link PentecostMonday}.
 */
class PentecostMondayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PentecostMonday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-21", "2019-06-10", "2020-06-01", "2021-05-24", "2022-06-06", "2023-05-29", "2024-05-20",
                "2025-06-09", "2026-05-25", "2027-05-17", "2028-06-05"
        );
    }
}
