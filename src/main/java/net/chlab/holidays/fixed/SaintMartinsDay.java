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
 * "St. Martin's Day" holiday that takes place every year on November 11th.
 */
public class SaintMartinsDay extends AbstractFixedDayHoliday {

    private static final MonthDay NOVEMBER_11TH = MonthDay.of(Month.NOVEMBER, 11);

    public SaintMartinsDay() {
        super(NOVEMBER_11TH);
    }
}
