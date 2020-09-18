package com.epam.daycalc.data;

import java.time.YearMonth;

/**
 * Interface for receiving incoming data
 */
public interface YearMonthProvider {

    /**
     * Getting an YearMonth object
     *
     * @return YearMonth
     */
    YearMonth getYearMonth();
}
