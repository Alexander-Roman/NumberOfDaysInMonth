package com.epam.daycalc.data;

import com.epam.daycalc.view.UserInput;

import java.time.Month;
import java.time.YearMonth;

public class ConsoleYearMonthProvider implements YearMonthProvider {

    public int getYear() {
        UserInput input = new UserInput();
        return input.getInt("Введите год:");
    }

    public Month getMonth() {
        UserInput input = new UserInput();
        int month = 0;

        while (month < 1 || month > 12) {
            month = input.getInt("Введите номер месяца от 1 до 12:");
        }

        return Month.of(month);
    }

    @Override
    public YearMonth getYearMonth() {
        int year = getYear();
        Month month = getMonth();

        return YearMonth.of(year, month);
    }

}
