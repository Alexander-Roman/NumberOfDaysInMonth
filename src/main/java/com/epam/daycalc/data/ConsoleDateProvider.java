package com.epam.daycalc.data;

import com.epam.daycalc.view.UserInput;

import java.time.Month;
import java.time.Year;

public class ConsoleDateProvider implements DateProvider {

    @Override
    public Year getYear() {
        UserInput input = new UserInput();
        int isoYear = input.getInt("Введите год:");
        return Year.of(isoYear);
    }

    @Override
    public Month getMonth() {
        UserInput input = new UserInput();
        int month = 0;

        while (month < 1 || month > 12) {
            month = input.getInt("Введите номер месяца от 1 до 12:");
        }

        return Month.of(month);
    }
}
