package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link AscensionOfJesus}.
 */
class AscensionOfJesusTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AscensionOfJesus();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-10", "2019-05-30", "2020-05-21", "2021-05-13", "2022-05-26", "2023-05-18", "2024-05-09",
                "2025-05-29", "2026-05-14", "2027-05-06", "2028-05-25"
        );
    }
}
