package com.companyname.jul;

import java.util.logging.Logger;

public class App
{
    public static void main( String[] args )
    {
        final Logger logger = Logger.getLogger(App.class.getName());

        logger.severe("A severe message");
        logger.warning("A warning message");
        logger.info("A different info message");
        logger.config("A config message");
        logger.fine("A fine message");
        logger.finer("A finer message");
        logger.finest("Finest message with some extra information in it: " + System.currentTimeMillis());
    }
}
