package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link PentecostSunday}.
 */
class PentecostSundayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PentecostSunday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-20", "2019-06-09", "2020-05-31", "2021-05-23", "2022-06-05", "2023-05-28", "2024-05-19",
                "2025-06-08", "2026-05-24", "2027-05-16", "2028-06-04"
        );
    }
}
