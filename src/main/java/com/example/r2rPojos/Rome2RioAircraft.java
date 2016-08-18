package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioAircraft", description = "Representation of one rome2rio aircraft response")
public class Rome2RioAircraft implements Serializable{

    @ApiModelProperty(value = "Aircraft code", required = true)
    private String aircraftCode;

    @ApiModelProperty(value = "Aircraft manufacturer", required = true)
    private String aircraftManufacturer;

    @ApiModelProperty(value = "Aircraft model", required = true)
    private String aircraftModel;

    public Rome2RioAircraft() {
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public String getAircraftManufacturer() {
        return aircraftManufacturer;
    }

    public void setAircraftManufacturer(String aircraftManufacturer) {
        this.aircraftManufacturer = aircraftManufacturer;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }
}
