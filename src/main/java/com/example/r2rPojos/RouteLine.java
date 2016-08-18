package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteLine", description = "Representation of transit line")
public class RouteLine implements Serializable{

    @ApiModelProperty(value = "Line code", required = true)
    private String lineCode;

    @ApiModelProperty(value = "Line name", required = true)
    private String lineName;

    @ApiModelProperty(value = "Vehicle display name", required = true)
    private String vehicle;

    @ApiModelProperty(value = "Agency code", required = true)
    private String agency;

    @ApiModelProperty(value = "Estimated feequency", required = true)
    private int frequency;

    @ApiModelProperty(value = "Estimated duration", required = true)
    private int duration;

    @ApiModelProperty(value = "Days of operation bitmask", required = true)
    private int days;

    public RouteLine() {
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
