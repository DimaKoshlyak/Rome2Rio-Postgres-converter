package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioAgency", description = "Representation of one rome2rio agency response")
public class Rome2RioAgency implements Serializable{
    @ApiModelProperty(value = "Agency code", required = true)
    private String agencyCode;

    @ApiModelProperty(value = "Agency name", required = true)
    private String agencyName;

    @ApiModelProperty(value = "Agency URL", required = true)
    private String agencyUrl;

    @ApiModelProperty(value = "Icon path", required = true)
    private String iconPath;

    @ApiModelProperty(value = "Icon size height", required = true)
    private float iconSizeHeight;

    @ApiModelProperty(value = "Icon size weight", required = true)
    private float iconSizeWeight;

    @ApiModelProperty(value = "Icon offset X", required = true)
    private float iconOffsetX;

    @ApiModelProperty(value = "Icon offsetY", required = true)
    private float iconOffsetY;

    public Rome2RioAgency() {
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyUrl() {
        return agencyUrl;
    }

    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
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
