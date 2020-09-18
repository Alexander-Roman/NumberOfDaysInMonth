package com.epam.daycalc.data;

import com.epam.daycalc.view.UserInput;

import java.time.Month;
import java.time.YearMonth;

/**
 * Class for receiving incoming data from the console input
 */
public class ConsoleYearMonthProvider implements YearMonthProvider {

    /**
     * Gets the year from the user
     *
     * @return int year
     */
    public int getYear() {
        UserInput input = new UserInput();
        return input.getInt("Enter the year:");
    }

    /**
     * Gets a Month object from the user with input validation
     *
     * @return Month
     */
    public Month getMonth() {
        UserInput input = new UserInput();
        int month = 0;

        while (month < 1 || month > 12) {
            month = input.getInt("Enter the month number between 1 and 12:");
        }

        return Month.of(month);
    }

    /**
     * Gets YearMonth object from the user using separate getting the year and month
     *
     * @return YearMonth
     */
    @Override
    public YearMonth getYearMonth() {
        int year = getYear();
        Month month = getMonth();

        return YearMonth.of(year, month);
    }

}
