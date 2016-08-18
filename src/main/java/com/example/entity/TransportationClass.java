package com.example.entity;

/**
 * Created by dima on 10.08.16.
 */
public enum TransportationClass {
    CHEAPEST("Cheapest"),
    ECONOMY("Economy"),
    BUSINESS("Business"),
    PREMIUM("Premium");

    private final String value;

    TransportationClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
