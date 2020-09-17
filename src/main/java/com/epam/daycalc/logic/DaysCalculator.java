package com.epam.daycalc.logic;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class DaysCalculator {

    public int findNumberOfDaysInMonth(Year year, Month month) {
        LocalDate date = LocalDate.of(year.getValue(), month.getValue(), 1);
        return date.lengthOfMonth();
    }
}
