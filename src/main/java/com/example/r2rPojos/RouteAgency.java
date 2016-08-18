package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteAgency", description = "Representation of one route agency")
public class RouteAgency implements Serializable{

    @ApiModelProperty(value = "Agency", required = true)
    private String agency;

    @ApiModelProperty(value = "Frequency", required = true)
    private int frequency;

    @ApiModelProperty(value = "Duration", required = true)
    private int duration;

    @ApiModelProperty(value = "List of actions", required = true)
    private List<RouteAction> actions;

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

    public List<RouteAction> getActions() {
        return actions;
    }

    public void setActions(List<RouteAction> actions) {
        this.actions = actions;
    }
}
