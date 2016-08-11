package com.companyname.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{

    private static String param() {
        return "LAMBDA";
    }

    public static void main( String[] args )
    {
        final Logger logger = LogManager.getLogger(App.class.getName());

        logger.trace("A log4j trace message");
        logger.debug("A log4j debug message");
        logger.info("A log4j info message");
        logger.warn("A log4j warning message");
        logger.error("A log4j error message");

        logger.debug("An info message with: {}", () -> param());

    }
}
