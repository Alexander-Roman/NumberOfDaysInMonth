package com.epam.daycalc.view;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UserInput {

    static Logger logger = LogManager.getLogger();

    public int getInt() {

        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        int input = scanner.nextInt();
        logger.log(Level.INFO, input);
        return input;
    }

    public int getInt(String message) {
        logger.log(Level.INFO, message);
        return getInt();
    }
}
