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
 * Unit test of class {@link SecondAdvent}.
 */
class SecondAdventTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new SecondAdvent();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-12-09", "2019-12-08", "2020-12-06", "2021-12-05", "2022-12-04", "2023-12-10", "2024-12-08",
                "2025-12-07", "2026-12-06", "2027-12-05", "2028-12-10"
        );
    }
}
