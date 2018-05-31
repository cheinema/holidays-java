package net.chlab.holidays.christmas;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link FirstAdvent}.
 */
class FirstAdventTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new FirstAdvent();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2017-12-03", "2018-12-02", "2019-12-01", "2020-11-29", "2021-11-28", "2022-11-27", "2023-12-03",
                "2024-12-01", "2025-11-30", "2026-11-29", "2027-11-28", "2028-12-03"
        );
    }
}
