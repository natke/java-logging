Java Logging Demonstration Project
----------------------------------

There are three modules in this gradle project:
- JUL which employs java.util.logging
- log4j which employs log4j2
- logback which employs slf4j/logback

Each module has a very simple main which prints out some logging statements, and a properties file to configure logging.

To run a module, clone the repository, and from the top level of the project, run:
- ./gradlew JUL:run -DmainClass=com.companyname.jul.App
- ./gradlew log4j:run -DmainClass=com.companyname.log4j.App
- ./gradlew logback:run -DmainClass=com.companyname.logback.App
