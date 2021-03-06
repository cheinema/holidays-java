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
 * Unit test of class {@link AshWednesday}.
 */
class AshWednesdayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AshWednesday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-02-14", "2019-03-06", "2020-02-26", "2021-02-17", "2022-03-02", "2023-02-22", "2024-02-14",
                "2025-03-05", "2026-02-18", "2027-02-10", "2028-03-01"
        );
    }
}
