package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioAirline", description = "Representation of one rome2rio airline response")
public class Rome2RioAirline implements Serializable {
    @ApiModelProperty(value = "Airline code", required = true)
    private String airlineCode;

    @ApiModelProperty(value = "Airline name", required = true)
    private String airlineName;

    @ApiModelProperty(value = "Airline URL", required = true)
    private String airlineUrl;

    @ApiModelProperty(value = "Icon path", required = true)
    private String iconPath;

    @ApiModelProperty(value = "Icon size height", required = true)
    private float iconSizeHeight;

    @ApiModelProperty(value = "Icon size weight", required = true)
    private float iconSizeWeight;

    @ApiModelProperty(value = "Icon offset X", required = true)
    private float iconOffsetX;

    @ApiModelProperty(value = "Icon offset Y", required = true)
    private float iconOffsetY;

    public Rome2RioAirline() {
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineUrl() {
        return airlineUrl;
    }

    public void setAirlineUrl(String airlineUrl) {
        this.airlineUrl = airlineUrl;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public float getIconSizeHeight() {
        return iconSizeHeight;
    }

    public void setIconSizeHeight(float iconSizeHeight) {
        this.iconSizeHeight = iconSizeHeight;
    }

    public float getIconSizeWeight() {
        return iconSizeWeight;
    }

    public void setIconSizeWeight(float iconSizeWeight) {
        this.iconSizeWeight = iconSizeWeight;
    }

    public float getIconOffsetX() {
        return iconOffsetX;
    }

    public void setIconOffsetX(float iconOffsetX) {
        this.iconOffsetX = iconOffsetX;
    }

    public float getIconOffsetY() {
        return iconOffsetY;
    }

    public void setIconOffsetY(float iconOffsetY) {
        this.iconOffsetY = iconOffsetY;
    }
}
