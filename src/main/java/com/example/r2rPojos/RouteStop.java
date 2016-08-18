package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteStop", description = "Representation of one route stop between segments")
public class RouteStop implements Serializable{
    @ApiModelProperty(value = "Type of stop", required = true)
    private String stopKind;

    @ApiModelProperty(value = "Stop name", required = true)
    private String stopName;

    @ApiModelProperty(value = "Stop location coordinates", required = true)
    private LocationCoordinates stopCoordinates;

    @ApiModelProperty(value = "Stop code", required = true)
    private String code;

    @ApiModelProperty(value = "Country code", required = true)
    private String countryCode;

    @ApiModelProperty(value = "Region code", required = true)
    private String regionCode;

    @ApiModelProperty(value = "Time zone", required = true)
    private String timeZone;

    public RouteStop() {
    }

    public String getStopKind() {
        return stopKind;
    }

    public void setStopKind(String stopKind) {
        this.stopKind = stopKind;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public LocationCoordinates getStopCoordinates() {
        return stopCoordinates;
    }

    public void setStopCoordinates(LocationCoordinates stopCoordinates) {
        this.stopCoordinates = stopCoordinates;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
