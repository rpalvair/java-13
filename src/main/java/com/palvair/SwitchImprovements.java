package com.palvair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DayOfWeek;

public class SwitchImprovements {


    private static final Logger LOGGER = LoggerFactory.getLogger(SwitchImprovements.class);

    public String getMessage(final DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> "Stay focus";
            case FRIDAY -> "It's friday!";
            default -> {
                LOGGER.debug("Life is good!");
                yield "Life is good!";
            }
        };
    }
}
