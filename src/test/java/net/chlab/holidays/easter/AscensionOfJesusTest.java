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
 * Unit test of class {@link AscensionOfJesus}.
 */
class AscensionOfJesusTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new AscensionOfJesus();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "2018-05-10", "2019-05-30", "2020-05-21", "2021-05-13", "2022-05-26", "2023-05-18", "2024-05-09",
                "2025-05-29", "2026-05-14", "2027-05-06", "2028-05-25"
        );
    }
}
