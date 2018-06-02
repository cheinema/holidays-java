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
 * Unit test of class {@link EasterMonday}.
 */
class EasterMondayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new EasterMonday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "1943-04-26", "1954-04-19", "1981-04-20",
                "2000-04-24", "2001-04-16", "2002-04-01", "2003-04-21", "2004-04-12", "2005-03-28", "2006-04-17",
                "2007-04-09", "2008-03-24", "2009-04-13", "2010-04-05", "2011-04-25", "2012-04-09", "2013-04-01",
                "2014-04-21", "2015-04-06", "2016-03-28", "2017-04-17", "2018-04-02", "2019-04-22", "2020-04-13",
                "2021-04-05", "2022-04-18", "2023-04-10", "2024-04-01", "2025-04-21", "2026-04-06", "2027-03-29",
                "2028-04-17", "2029-04-02", "2030-04-22", "2031-04-14", "2032-03-29", "2033-04-18", "2034-04-10",
                "2035-03-26", "2036-04-14", "2037-04-06", "2038-04-26", "2039-04-11", "2040-04-02"
        );
    }
}
