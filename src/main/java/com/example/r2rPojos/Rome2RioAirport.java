package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioAirport", description = "Representation of one rome2rio airport response")
public class Rome2RioAirport implements Serializable{
    @ApiModelProperty(value = "Airport code", required = true)
    private String airportCode;

    @ApiModelProperty(value = "Airport name", required = true)
    private String airportName;

    @ApiModelProperty(value = "Airport location coordinates", required = true)
    private LocationCoordinates coordinates;

    @ApiModelProperty(value = "Country code", required = true)
    private String countryCode;

    @ApiModelProperty(value = "Region code", required = true)
    private String regionCode;

    @ApiModelProperty(value = "Time zone", required = true)
    private String timeZone;

    public Rome2RioAirport() {
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public LocationCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(LocationCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
