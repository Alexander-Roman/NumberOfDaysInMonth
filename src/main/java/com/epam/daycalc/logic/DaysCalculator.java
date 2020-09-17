package com.epam.daycalc.logic;

import java.time.YearMonth;

public class DaysCalculator {

    public int findNumberOfDaysInMonth(YearMonth yearMonth) {
        return yearMonth.lengthOfMonth();
    }
}
