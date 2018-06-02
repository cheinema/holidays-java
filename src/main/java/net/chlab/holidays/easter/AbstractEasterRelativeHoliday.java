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

import java.time.LocalDate;
import java.time.Year;

/**
 * Abstract implementation of holidays relative to the easter sunday.
 */
public abstract class AbstractEasterRelativeHoliday implements Holiday {

    private final int daysToAdd;

    public AbstractEasterRelativeHoliday(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }

    @Override
    public LocalDate atYear(Year year) {
        return easter(year).plusDays(daysToAdd);
    }

    private LocalDate easter(Year year) {
        // easter formula by Heiner Lichtenberg (extended Gauss algorithm)
        final int x = year.getValue();
        final int k = x / 100;
        final int m = 15 + (3 * k + 3) / 4 - (8 * k + 13) / 25;
        final int s = 2 - (3 * k + 3) / 4;
        final int a = x % 19;
        final int d = (19 * a + m) % 30;
        final int r = (d + a / 11) / 29;
        final int og = 21 + d - r;
        final int sz = 7 - (x + x / 4 + s) % 7;
        final int oe = 7 - (og - sz) % 7;
        final int os = og + oe;
        return LocalDate.of(x, 3, 1).plusDays(os - 1);
    }
}
