package com.epam.daycalc.factory;

import com.epam.daycalc.data.ConsoleYearMonthProvider;
import com.epam.daycalc.data.YearMonthProvider;

public class ConsoleYearMonthProviderFactory implements YearMonthProviderFactory {

    @Override
    public YearMonthProvider createYearMonth() {
        return new ConsoleYearMonthProvider();
    }
}
