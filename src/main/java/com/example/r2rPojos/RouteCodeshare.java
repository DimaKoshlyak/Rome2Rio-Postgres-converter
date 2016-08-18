package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteCodeshare", description = "Representation of one route codeshare")
public class RouteCodeshare implements Serializable{
    @ApiModelProperty(value = "Airline codeshare", required = true)
    private String codeshareAirline;

    @ApiModelProperty(value = "Flight codeshare", required = true)
    private String codeshareFlight;

    public RouteCodeshare() {
    }

    public String getCodeshareAirline() {
        return codeshareAirline;
    }

    public void setCodeshareAirline(String codeshareAirline) {
        this.codeshareAirline = codeshareAirline;
    }

    public String getCodeshareFlight() {
        return codeshareFlight;
    }

    public void setCodeshareFlight(String codeshareFlight) {
        this.codeshareFlight = codeshareFlight;
    }
}
