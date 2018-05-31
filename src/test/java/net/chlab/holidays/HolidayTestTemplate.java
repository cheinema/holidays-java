package net.chlab.holidays;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.Year;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface HolidayTestTemplate {

    Holiday instance();

    Stream<String> expectedDates();

    @ParameterizedTest
    @MethodSource("expectedDates")
    default void shouldCalculateAtYear(String expectedDate) {
        final LocalDate expectedLocalDate = LocalDate.parse(expectedDate);
        final Year year = Year.from(expectedLocalDate);
        assertThat(instance().atYear(year)).isEqualTo(expectedLocalDate);
    }
}
