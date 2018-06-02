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
 * Unit test of class {@link PalmSunday}.
 */
class PalmSundayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PalmSunday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-03-25", "2019-04-14", "2020-04-05", "2021-03-28", "2022-04-10", "2023-04-02", "2024-03-24",
                "2025-04-13", "2026-03-29", "2027-03-21", "2028-04-09"
        );
    }
}
