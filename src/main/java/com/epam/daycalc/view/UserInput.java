package com.epam.daycalc.view;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Service class for receiving data entered by the user from the keyboard.
 */
public class UserInput {

    /**
     * The logger is used to display prompts to the console
     */
    static Logger logger = LogManager.getLogger();

    /**
     * Method for getting integer value from user.
     * When receiving a different value, the method repeats requests until an integer is received.
     *
     * @return int number entered by user
     */
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

    /**
     * Prints an prompt message to console and gets an integer value from user.
     * When receiving a different value, the method repeats requests until an integer is received.
     *
     * @param message an invitation for data entry
     * @return int number entered by user
     */
    public int getInt(String message) {
        logger.log(Level.INFO, message);
        return getInt();
    }
}
