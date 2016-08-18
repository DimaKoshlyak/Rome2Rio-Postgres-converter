package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioPlace", description = "Representation of one rome2rio place response")
public class Rome2RioPlace implements Serializable{
    @ApiModelProperty(value = "Type of place", required = true)
    private String placeKind;

    @ApiModelProperty(value = "Place name", required = true)
    private String placeName;

    @ApiModelProperty(value = "Place full name", required = true)
    private String placeLongName;

    @ApiModelProperty(value = "Place location coordinates", required = true)
    private LocationCoordinates coordinates;

    @ApiModelProperty(value = "Country code", required = true)
    private String countryCode;

    @ApiModelProperty(value = "Region code", required = true)
    private String regionCode;

    @ApiModelProperty(value = "Time zone", required = true)
    private String timeZone;

    public Rome2RioPlace() {
    }

    public String getPlaceKind() {
        return placeKind;
    }

    public void setPlaceKind(String placeKind) {
        this.placeKind = placeKind;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceLongName() {
        return placeLongName;
    }

    public void setPlaceLongName(String placeLongName) {
        this.placeLongName = placeLongName;
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
