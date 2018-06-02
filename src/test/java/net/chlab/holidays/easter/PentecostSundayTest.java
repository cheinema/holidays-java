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
 * Unit test of class {@link PentecostSunday}.
 */
class PentecostSundayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new PentecostSunday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-20", "2019-06-09", "2020-05-31", "2021-05-23", "2022-06-05", "2023-05-28", "2024-05-19",
                "2025-06-08", "2026-05-24", "2027-05-16", "2028-06-04"
        );
    }
}
