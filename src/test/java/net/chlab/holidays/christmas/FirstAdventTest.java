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
