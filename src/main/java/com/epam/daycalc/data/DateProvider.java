package com.epam.daycalc.data;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public interface DateProvider {

    Year getYear();

    Month getMonth();
}
