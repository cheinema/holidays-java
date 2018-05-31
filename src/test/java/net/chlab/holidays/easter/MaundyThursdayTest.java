package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link MaundyThursday}.
 */
class MaundyThursdayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new MaundyThursday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-03-29", "2019-04-18", "2020-04-09", "2021-04-01", "2022-04-14", "2023-04-06", "2024-03-28",
                "2025-04-17", "2026-04-02", "2027-03-25", "2028-04-13"
        );
    }
}
