package com.epam.daycalc.logic;

import org.junit.Assert;
import org.junit.Test;

import java.time.Month;
import java.time.Year;

public class DaysCalculatorTest {

    @Test
    public void findNumberOfDaysInMonthTestForThirtyOneDayMonth() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 31;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2020), Month.MARCH);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestForThirtyDayMonth() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 30;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2020), Month.APRIL);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryCommonYear() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 28;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2021), Month.FEBRUARY);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryCommonYearMultipleOfOneHundred() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 28;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2100), Month.FEBRUARY);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryLeapYearMultipleOfFourHundred() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 29;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2400), Month.FEBRUARY);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryLeapYearMultipleOfFour() {
        DaysCalculator calculator = new DaysCalculator();

        int expected = 29;
        int actual = calculator.findNumberOfDaysInMonth(Year.of(2024), Month.FEBRUARY);

        Assert.assertEquals(expected, actual);
    }

}
