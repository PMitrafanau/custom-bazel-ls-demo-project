package com.epam;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public final class GreetingUtils {

    private GreetingUtils() {

    }

    public static String greet(String name) {
        return StringUtils.lowerCase("HELLO, ").concat(name);
    }
}
