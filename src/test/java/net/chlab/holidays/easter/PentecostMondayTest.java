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
 * Unit test of class {@link PentecostMonday}.
 */
class PentecostMondayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PentecostMonday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-21", "2019-06-10", "2020-06-01", "2021-05-24", "2022-06-06", "2023-05-29", "2024-05-20",
                "2025-06-09", "2026-05-25", "2027-05-17", "2028-06-05"
        );
    }
}
