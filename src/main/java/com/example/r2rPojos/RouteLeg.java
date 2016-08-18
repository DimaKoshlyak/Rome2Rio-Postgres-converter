package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */

@ApiModel(value = "RouteLeg", description = "Representation of flight legs")
public class RouteLeg implements Serializable{
    @ApiModelProperty(value = "Leg URL", required = true)
    private String url;

    @ApiModelProperty(value = "Host", required = true)
    private String host;

    @ApiModelProperty(value = "List of hops", required = true)
    private List<RouteHop> hops;

    public RouteLeg() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<RouteHop> getHops() {
        return hops;
    }

    public void setHops(List<RouteHop> hops) {
        this.hops = hops;
    }
}
