package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link RoseMonday}.
 */
class RoseMondayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new RoseMonday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-02-12", "2019-03-04", "2020-02-24", "2021-02-15", "2022-02-28", "2023-02-20", "2024-02-12",
                "2025-03-03", "2026-02-16", "2027-02-08", "2028-02-28"
        );
    }
}
