package com.palvair;

import org.junit.jupiter.api.Test;

import static java.time.DayOfWeek.*;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchImprovementsTest {

    @Test
    public void should_return_message_when_monday() {
        final String message = new SwitchImprovements().getMessage(MONDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Stay focus");
    }

    @Test
    public void should_return_message_when_tuesday() {
        final String message = new SwitchImprovements().getMessage(TUESDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Stay focus");
    }

    @Test
    public void should_return_message_when_wednesday() {
        final String message = new SwitchImprovements().getMessage(WEDNESDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Stay focus");
    }

    @Test
    public void should_return_message_when_thursday() {
        final String message = new SwitchImprovements().getMessage(THURSDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Stay focus");
    }

    @Test
    public void should_return_message_when_friday() {
        final String message = new SwitchImprovements().getMessage(FRIDAY);

        assertThat(message).isNotNull()
                .isEqualTo("It's friday!");
    }

    @Test
    public void should_return_message_when_saturday() {
        final String message = new SwitchImprovements().getMessage(SATURDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Life is good!");
    }

    @Test
    public void should_return_message_when_sunday() {
        final String message = new SwitchImprovements().getMessage(SUNDAY);

        assertThat(message).isNotNull()
                .isEqualTo("Life is good!");
    }

}