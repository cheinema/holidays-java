package net.chlab.holidays;

import java.time.LocalDate;
import java.time.Year;

public interface Holiday {

    LocalDate atYear(Year year);
}
