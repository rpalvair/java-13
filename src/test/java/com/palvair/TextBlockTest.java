package com.palvair;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBlockTest {

    private static final String JSON = """
            { "firstname": "Ruddy",
              "lastname": "Palvair"
            }
            """;

    private static final String JSON_TO_FORMAT = """
            { "firstname": "%s",
              "lastname": "%s"
            }
            """;

    @Test
    public void should_execute_string_methods_when_text_block() {
        assertThat(JSON.contains("Palvair")).isTrue();
        assertThat(JSON.indexOf("{")).isEqualTo(0);
        assertThat(JSON.indent(0)).isEqualTo(JSON);
    }

    @Test
    public void should_format_text_block() {
        assertThat(JSON_TO_FORMAT.formatted("John", "Doe")).contains("John", "Doe");
        assertThat(String.format(JSON_TO_FORMAT, "John", "Doe")).contains("John", "Doe");
    }
}
