package com.epam.daycalc.view;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class for displaying the results to the console
 */
public class ConsoleDaysOutput implements DaysOutput {

    /**
     * Logger outputs data to the console
     */
    static Logger logger = LogManager.getLogger();

    /**
     * Prints the number of days in a month to the console
     *
     * @param days amount of days
     */
    @Override
    public void outputNumberOfDays(int days) {
        logger.log(Level.INFO, "Number of days in the month: " + days);
    }
}
