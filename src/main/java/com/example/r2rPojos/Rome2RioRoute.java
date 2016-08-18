package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "Rome2RioRoute", description = "Representation of one rome2rio route response")
public class Rome2RioRoute implements Serializable{
    @ApiModelProperty(value = "Route name", required = true)
    private String routeName;

    @ApiModelProperty(value = "Route distance", required = true)
    private float routeDistance;

    @ApiModelProperty(value = "Route duration", required = true)
    private float routeDuration;

    @ApiModelProperty(value = "Route total transfer duration", required = true)
    private float routeTotalTransferDuration;

    @ApiModelProperty(value = "Route price", required = true)
    private Float routePrice;

    @ApiModelProperty(value = "Route currency", required = true)
    private String routeCurrency;

    @ApiModelProperty(value = "Route native price", required = true)
    private Float routeNativePrice;

    @ApiModelProperty(value = "Route native currency", required = true)
    private String routeNativeCurrency;

    @ApiModelProperty(value = "Is free transfer", required = true)
    private Boolean isFreeTransfer;

    @ApiModelProperty(value = "List of stops", required = true)
    private List<RouteStop> stops;

    @ApiModelProperty(value = "List of segments", required = true)
    private List<RouteSegment> segments;

    public Rome2RioRoute() {
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public float getRouteDistance() {
        return routeDistance;
    }

    public void setRouteDistance(float routeDistance) {
        this.routeDistance = routeDistance;
    }

    public float getRouteDuration() {
        return routeDuration;
    }

    public void setRouteDuration(float routeDuration) {
        this.routeDuration = routeDuration;
    }

    public float getRouteTotalTransferDuration() {
        return routeTotalTransferDuration;
    }

    public void setRouteTotalTransferDuration(float routeTotalTransferDuration) {
        this.routeTotalTransferDuration = routeTotalTransferDuration;
    }

    public Float getRoutePrice() {
        return routePrice;
    }

    public void setRoutePrice(Float routePrice) {
        this.routePrice = routePrice;
    }

    public String getRouteCurrency() {
        return routeCurrency;
    }

    public void setRouteCurrency(String routeCurrency) {
        this.routeCurrency = routeCurrency;
    }

    public Float getRouteNativePrice() {
        return routeNativePrice;
    }

    public void setRouteNativePrice(Float routeNativePrice) {
        this.routeNativePrice = routeNativePrice;
    }

    public String getRouteNativeCurrency() {
        return routeNativeCurrency;
    }

    public void setRouteNativeCurrency(String routeNativeCurrency) {
        this.routeNativeCurrency = routeNativeCurrency;
    }

    public Boolean getIsFreeTransfer() {
        return isFreeTransfer;
    }

    public void setIsFreeTransfer(Boolean isFreeTransfer) {
        this.isFreeTransfer = isFreeTransfer;
    }

    public List<RouteStop> getStops() {
        return stops;
    }

    public void setStops(List<RouteStop> stops) {
        this.stops = stops;
    }

    public List<RouteSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<RouteSegment> segments) {
        this.segments = segments;
    }
}
