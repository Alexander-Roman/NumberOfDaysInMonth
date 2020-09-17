/*
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце
 * и корректно определялись все високосные года.
 */

package com.epam.daycalc.main;

import com.epam.daycalc.data.ConsoleDateProvider;
import com.epam.daycalc.data.DateProvider;
import com.epam.daycalc.logic.DaysCalculator;
import com.epam.daycalc.view.ConsoleDaysOutput;
import com.epam.daycalc.view.DaysOutput;

import java.time.Month;
import java.time.Year;

public class Runner {

    public static void main(String[] args) {

        DateProvider provider = new ConsoleDateProvider();
        Year year = provider.getYear();
        Month month = provider.getMonth();

        DaysCalculator calculator = new DaysCalculator();
        int days = calculator.findNumberOfDaysInMonth(year, month);

        DaysOutput output = new ConsoleDaysOutput();
        output.outputNumberOfDays(days);

    }
}
