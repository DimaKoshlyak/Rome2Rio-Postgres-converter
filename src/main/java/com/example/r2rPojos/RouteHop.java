package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteHop", description = "Representation of flight hops")
public class RouteHop implements Serializable {
    @ApiModelProperty(value = "Source display name", required = true)
    private String sName;

    @ApiModelProperty(value = "Source code", required = true)
    private String sCode;

    @ApiModelProperty(value = "Source position", required = true)
    private LocationCoordinates sPos;

    @ApiModelProperty(value = "Source time", required = true)
    private String sTime;

    @ApiModelProperty(value = "Target display name", required = true)
    private String tName;

    @ApiModelProperty(value = "Targer code", required = true)
    private String tCode;

    @ApiModelProperty(value = "tArrival time (24-hour local time - hh:mm", required = true)
    private String tTime;

    @ApiModelProperty(value = "Target location coordinates", required = true)
    private LocationCoordinates tPos;

    @ApiModelProperty(value = "Flight number", required = true)
    private String flight;

    @ApiModelProperty(value = "Airline", required = true)
    private String airline;

    @ApiModelProperty(value = "Aircraft", required = true)
    private String aircraft;

    @ApiModelProperty(value = "Estimated frequency (per week)", required = true)
    private int frequency;

    @ApiModelProperty(value = "Duration", required = true)
    private int duration;

    @ApiModelProperty(value = "Hop price", required = true)
    private Float hopPrice;

    @ApiModelProperty(value = "Hop currency", required = true)
    private String hopCurrency;

    @ApiModelProperty(value = "Hop native price", required = true)
    private Float hopNativePrice;

    @ApiModelProperty(value = "Hop native currency", required = true)
    private String hopNativeCurrency;

    @ApiModelProperty(value = "Is free transfer", required = true)
    private Boolean isFreeTransfer;

    @ApiModelProperty(value = "List of route lines", required = true)
    private List<RouteLine> lines;

    @ApiModelProperty(value = "List of route agencies", required = true)
    private List<RouteAgency> agencies;

    @ApiModelProperty(value = "List of codeshares", required = true)
    private List<RouteCodeshare> codeshares;

    public RouteHop() {
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public LocationCoordinates getsPos() {
        return sPos;
    }

    public void setsPos(LocationCoordinates sPos) {
        this.sPos = sPos;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public LocationCoordinates gettPos() {
        return tPos;
    }

    public void settPos(LocationCoordinates tPos) {
        this.tPos = tPos;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
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

    public Float getHopPrice() {
        return hopPrice;
    }

    public void setHopPrice(Float hopPrice) {
        this.hopPrice = hopPrice;
    }

    public String getHopCurrency() {
        return hopCurrency;
    }

    public void setHopCurrency(String hopCurrency) {
        this.hopCurrency = hopCurrency;
    }

    public Float getHopNativePrice() {
        return hopNativePrice;
    }

    public void setHopNativePrice(Float hopNativePrice) {
        this.hopNativePrice = hopNativePrice;
    }

    public String getHopNativeCurrency() {
        return hopNativeCurrency;
    }

    public void setHopNativeCurrency(String hopNativeCurrency) {
        this.hopNativeCurrency = hopNativeCurrency;
    }

    public Boolean getIsFreeTransfer() {
        return isFreeTransfer;
    }

    public void setIsFreeTransfer(Boolean isFreeTransfer) {
        this.isFreeTransfer = isFreeTransfer;
    }

    public List<RouteLine> getLines() {
        return lines;
    }

    public void setLines(List<RouteLine> lines) {
        this.lines = lines;
    }

    public List<RouteAgency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<RouteAgency> agencies) {
        this.agencies = agencies;
    }

    public List<RouteCodeshare> getCodeshares() {
        return codeshares;
    }

    public void setCodeshares(List<RouteCodeshare> codeshares) {
        this.codeshares = codeshares;
    }
}
