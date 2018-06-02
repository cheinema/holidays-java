/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2018-2018 the original author or authors.
 */
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
