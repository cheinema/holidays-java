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
package net.chlab.holidays.fixed;

import java.time.Month;
import java.time.MonthDay;

/**
 * "Augsburg's High Peace Festival" holiday that takes place every year on August 8th.
 */
public class AugsburgsHighPeaceFestival extends AbstractFixedDayHoliday {

    private static final MonthDay AUGUST_8TH = MonthDay.of(Month.AUGUST, 8);

    public AugsburgsHighPeaceFestival() {
        super(AUGUST_8TH);
    }
}
