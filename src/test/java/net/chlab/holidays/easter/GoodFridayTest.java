package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link GoodFriday}.
 */
class GoodFridayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new GoodFriday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-03-30", "2019-04-19", "2020-04-10", "2021-04-02", "2022-04-15", "2023-04-07", "2024-03-29",
                "2025-04-18", "2026-04-03", "2027-03-26", "2028-04-14"
        );
    }
}
