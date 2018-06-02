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
