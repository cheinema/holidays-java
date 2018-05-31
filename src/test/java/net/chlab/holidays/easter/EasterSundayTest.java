package net.chlab.holidays.easter;

import net.chlab.holidays.Holiday;
import net.chlab.holidays.HolidayTestTemplate;

import java.util.stream.Stream;

/**
 * Unit test of class {@link EasterSunday}.
 */
class EasterSundayTest implements HolidayTestTemplate {

    @Override
    public Holiday instance() {
        return new EasterSunday();
    }

    @Override
    public Stream<String> expectedDates() {
        return Stream.of(
                "1943-04-25", "1954-04-18", "1981-04-19",
                "2000-04-23", "2001-04-15", "2002-03-31", "2003-04-20", "2004-04-11", "2005-03-27", "2006-04-16",
                "2007-04-08", "2008-03-23", "2009-04-12", "2010-04-04", "2011-04-24", "2012-04-08", "2013-03-31",
                "2014-04-20", "2015-04-05", "2016-03-27", "2017-04-16", "2018-04-01", "2019-04-21", "2020-04-12",
                "2021-04-04", "2022-04-17", "2023-04-09", "2024-03-31", "2025-04-20", "2026-04-05", "2027-03-28",
                "2028-04-16", "2029-04-01", "2030-04-21", "2031-04-13", "2032-03-28", "2033-04-17", "2034-04-09",
                "2035-03-25", "2036-04-13", "2037-04-05", "2038-04-25", "2039-04-10", "2040-04-01"
        );
    }
}
