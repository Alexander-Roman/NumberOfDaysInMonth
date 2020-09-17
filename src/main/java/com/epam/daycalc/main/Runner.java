/*
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце
 * и корректно определялись все високосные года.
 */

package com.epam.daycalc.main;

import com.epam.daycalc.data.YearMonthProvider;
import com.epam.daycalc.factory.ConsoleDaysOutputFactory;
import com.epam.daycalc.factory.ConsoleYearMonthProviderFactory;
import com.epam.daycalc.factory.DaysOutputFactory;
import com.epam.daycalc.factory.YearMonthProviderFactory;
import com.epam.daycalc.logic.DaysCalculator;
import com.epam.daycalc.view.DaysOutput;

import java.time.YearMonth;

public class Runner {

    public static void main(String[] args) {

        YearMonthProviderFactory yearMonthProviderFactory = new ConsoleYearMonthProviderFactory();
        YearMonthProvider provider = yearMonthProviderFactory.createYearMonth();

        YearMonth yearMonth = provider.getYearMonth();

        DaysCalculator calculator = new DaysCalculator();
        int days = calculator.findNumberOfDaysInMonth(yearMonth);

        DaysOutputFactory daysOutputFactory = new ConsoleDaysOutputFactory();
        DaysOutput output = daysOutputFactory.createDaysOutput();
        output.outputNumberOfDays(days);
    }
}
