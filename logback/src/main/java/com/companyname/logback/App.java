package com.companyname.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{

    public static void main( String[] args )
    {
        final Logger logger = LoggerFactory.getLogger(App.class.getName());

        logger.trace("A logback trace message");
        logger.debug("A logback debug message");
        logger.info("A logback info message");
        logger.warn("A logback warning message");
        logger.error("A logback error message");

        String parameter = "PARAM";
        logger.info("An info message with: {}", parameter);


    }
}
