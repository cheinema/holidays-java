package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link CorpusChristi}.
 */
class CorpusChristiTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new CorpusChristi();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-31", "2019-06-20", "2020-06-11", "2021-06-03", "2022-06-16", "2023-06-08", "2024-05-30",
                "2025-06-19", "2026-06-04", "2027-05-27", "2028-06-15"
        );
    }
}
