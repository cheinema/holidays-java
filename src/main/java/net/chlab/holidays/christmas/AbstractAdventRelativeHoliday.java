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

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * Abstract implementation of holidays relative to the first Advent. The first Advent is the sunday before December
 * 4th.
 */
public abstract class AbstractAdventRelativeHoliday implements Holiday {

    private static final MonthDay DECEMBER_4TH = MonthDay.of(12, 4);

    private final int daysToAdd;

    public AbstractAdventRelativeHoliday(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }

    @Override
    public LocalDate atYear(Year year) {
        return advent(year).plusDays(daysToAdd);
    }

    private LocalDate advent(Year year) {
        return year.atMonthDay(DECEMBER_4TH).with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
    }
}
