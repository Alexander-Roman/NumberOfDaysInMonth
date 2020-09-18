package com.epam.daycalc.logic;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.Month;
import java.time.YearMonth;

public class DaysCalculatorTest {

    private static DaysCalculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new DaysCalculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }

    @Test
    public void findNumberOfDaysInMonthTestForThirtyOneDayMonth() {
        int expected = 31;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2020, Month.MARCH));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestForThirtyDayMonth() {
        int expected = 30;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2020, Month.APRIL));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryCommonYear() {
        int expected = 28;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2021, Month.FEBRUARY));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryCommonYearMultipleOfOneHundred() {
        int expected = 28;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2100, Month.FEBRUARY));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryLeapYearMultipleOfFourHundred() {
        int expected = 29;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2400, Month.FEBRUARY));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfDaysInMonthTestFebruaryLeapYearMultipleOfFour() {
        int expected = 29;
        int actual = calculator.findNumberOfDaysInMonth(YearMonth.of(2024, Month.FEBRUARY));

        Assert.assertEquals(expected, actual);
    }

}
