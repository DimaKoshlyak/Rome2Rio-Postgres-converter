package com.example.entity;

import java.io.Serializable;

/**
 * Created by vlad
 */
public enum TransportType implements Serializable {
    FLIGHT("flight"),
    BUS("bus"),
    TRAIN("train"),
    RIDESHARE("rideshare"),
    UNDEFINED("undefined");


    private String transportType;

    TransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getValue() {
        return transportType;
    }

    @Override
    public String toString() {
        return transportType;
    }
}
