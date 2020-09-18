package com.epam.daycalc.logic;

import java.time.YearMonth;

/**
 * Class of logic for working with YearMonth objects
 */
public class DaysCalculator {

    /**
     * Calculates the number of days in a specific month and year
     *
     * @param yearMonth Incoming data
     * @return int Number of days in a month of the year
     */
    public int findNumberOfDaysInMonth(YearMonth yearMonth) {
        return yearMonth.lengthOfMonth();
    }
}
