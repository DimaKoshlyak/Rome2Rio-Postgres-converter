package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 22.03.16.
 */

@ApiModel(value = "RouteItinerary", description = "Representation of alternative transit itinerary")
public class RouteItinerary implements Serializable{
    @ApiModelProperty(value = "Is hidden", required = true)
    private int isHidden;

    @ApiModelProperty(value = "Is return", required = true)
    private int isReturn;

    @ApiModelProperty(value = "List of route legs", required = true)
    private List<RouteLeg> legs;

    public RouteItinerary() {
    }

    public int getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public int getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(int isReturn) {
        this.isReturn = isReturn;
    }

    public List<RouteLeg> getLegs() {
        return legs;
    }

    public void setLegs(List<RouteLeg> legs) {
        this.legs = legs;
    }
}
