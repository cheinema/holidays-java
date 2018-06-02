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
package net.chlab.holidays.weekday;

import net.chlab.holidays.Holiday;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * "Mother's Day" holiday that takes place on the 2nd sunday of May.
 */
public class MothersDay implements Holiday {

    private static MonthDay MAY_1ST = MonthDay.of(Month.MAY, 1);

    @Override
    public LocalDate atYear(Year year) {
        return year.atMonthDay(MAY_1ST).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
    }
}
