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
 * Unit test of class {@link PeoplesDayOfMouring}.
 */
class PeoplesDayOfMouringTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PeoplesDayOfMouring();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-11-18", "2019-11-17", "2020-11-15", "2021-11-14", "2022-11-13", "2023-11-19", "2024-11-17",
                "2025-11-16", "2026-11-15", "2027-11-14", "2028-11-19"
        );
    }
}
