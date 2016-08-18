package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteAction", description = "Representation of one route action")
public class RouteAction implements Serializable{

    @ApiModelProperty(value = "Action text", required = true)
    private String text;

    @ApiModelProperty(value = "Action URL", required = true)
    private String url;

    @ApiModelProperty(value = "Action display URL", required = true)
    private String displayUrl;

    @ApiModelProperty(value = "", required = true)
    private String moustacheUrl;

    public RouteAction() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public String getMoustacheUrl() {
        return moustacheUrl;
    }

    public void setMoustacheUrl(String moustacheUrl) {
        this.moustacheUrl = moustacheUrl;
    }
}
