package it.lysz210.enumeration;

import java.util.Objects;
import java.util.stream.Stream;

public enum Attribute {
    OFF ("no"),
    ON ("yes"),
    QUITE ("exit");

    public final String value;

    Attribute (String value) {
        this.value = value;
    }

    public static Attribute fromValue (String value) {
        Objects.requireNonNull(value);
        return Stream.of(values())
                .filter(attr -> attr.value.equalsIgnoreCase(value.trim()))
                .findFirst().orElseThrow();
    }
}
