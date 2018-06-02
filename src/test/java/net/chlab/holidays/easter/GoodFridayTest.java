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
 * Unit test of class {@link GoodFriday}.
 */
class GoodFridayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new GoodFriday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-03-30", "2019-04-19", "2020-04-10", "2021-04-02", "2022-04-15", "2023-04-07", "2024-03-29",
                "2025-04-18", "2026-04-03", "2027-03-26", "2028-04-14"
        );
    }
}
