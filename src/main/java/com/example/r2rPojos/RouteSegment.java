package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteSegment", description = "Representation of one segment ia a route")
public class RouteSegment implements Serializable{
    @ApiModelProperty(value = "Segment kind", required = true)
    private String kind;

    @ApiModelProperty(value = "Is this a dominant segment in the route?", required = true)
    private Boolean isMajor;

    @ApiModelProperty(value = "Is this segment in a location where imperial unit are used (eg: miles)?", required = true)
    private Boolean isImperial;

    @ApiModelProperty(value = "Estimated distance (in km)", required = true)
    private float distance;

    @ApiModelProperty(value = "Estimated duration (in minutes)", required = true)
    private float duration;

    @ApiModelProperty(value = "Transfer duration", required = true)
    private float transferDuration;

    @ApiModelProperty(value = "Source display name", required = true)
    private String sName;

    @ApiModelProperty(value = "Source location coordinates", required = true)
    private LocationCoordinates sPos;

    @ApiModelProperty(value = "Source code", required = true)
    private String sCode;

    @ApiModelProperty(value = "Target display name", required = true)
    private String tName;

    @ApiModelProperty(value = "Target location coordinates", required = true)
    private LocationCoordinates tPos;

    @ApiModelProperty(value = "Target code", required = true)
    private String tCode;

    @ApiModelProperty(value = "Segment price", required = true)
    private Float segmentPrice;

    @ApiModelProperty(value = "Segment currency", required = true)
    private String segmentCurrency;

    @ApiModelProperty(value = "Segment native price", required = true)
    private Float segmentNativePrice;

    @ApiModelProperty(value = "Segment native currency", required = true)
    private String segmentNativeCurrency;

    @ApiModelProperty(value = "Is free transfer", required = true)
    private Boolean isFreeTransfer;

    @ApiModelProperty(value = "Array of alternative transit itineraries", required = true)
    private List<RouteItinerary> itineraries;

    @ApiModelProperty(value = "List stops", required = true)
    private List<RouteStop> stops;

    public RouteSegment() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Boolean getIsMajor() {
        return isMajor;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public Boolean getIsImperial() {
        return isImperial;
    }

    public void setIsImperial(Boolean isImperial) {
        this.isImperial = isImperial;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getTransferDuration() {
        return transferDuration;
    }

    public void setTransferDuration(float transferDuration) {
        this.transferDuration = transferDuration;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public LocationCoordinates getsPos() {
        return sPos;
    }

    public void setsPos(LocationCoordinates sPos) {
        this.sPos = sPos;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public LocationCoordinates gettPos() {
        return tPos;
    }

    public void settPos(LocationCoordinates tPos) {
        this.tPos = tPos;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    public Float getSegmentPrice() {
        return segmentPrice;
    }

    public void setSegmentPrice(Float segmentPrice) {
        this.segmentPrice = segmentPrice;
    }

    public String getSegmentCurrency() {
        return segmentCurrency;
    }

    public void setSegmentCurrency(String segmentCurrency) {
        this.segmentCurrency = segmentCurrency;
    }

    public Float getSegmentNativePrice() {
        return segmentNativePrice;
    }

    public void setSegmentNativePrice(Float segmentNativePrice) {
        this.segmentNativePrice = segmentNativePrice;
    }

    public String getSegmentNativeCurrency() {
        return segmentNativeCurrency;
    }

    public void setSegmentNativeCurrency(String segmentNativeCurrency) {
        this.segmentNativeCurrency = segmentNativeCurrency;
    }

    public Boolean getIsFreeTransfer() {
        return isFreeTransfer;
    }

    public void setIsFreeTransfer(Boolean isFreeTransfer) {
        this.isFreeTransfer = isFreeTransfer;
    }

    public List<RouteItinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<RouteItinerary> itineraries) {
        this.itineraries = itineraries;
    }

    public List<RouteStop> getStops() {
        return stops;
    }

    public void setStops(List<RouteStop> stops) {
        this.stops = stops;
    }
}
