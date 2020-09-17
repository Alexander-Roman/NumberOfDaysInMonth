package com.epam.daycalc.view;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsoleDaysOutput implements DaysOutput {

    static Logger logger = LogManager.getLogger();

    @Override
    public void outputNumberOfDays(int days) {
        logger.log(Level.INFO, "Количество дней: " + days);
    }
}
