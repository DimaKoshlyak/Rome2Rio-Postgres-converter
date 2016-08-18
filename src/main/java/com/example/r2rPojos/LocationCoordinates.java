package com.example.r2rPojos;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 * Created by Dima Koshlyak on 09.02.16.
 *
 * Common class with coordinates of location or object
 */
public class LocationCoordinates {
    @XmlElement(name = "latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "longitude")
    protected BigDecimal longitude;

    public LocationCoordinates() {
    }

    public LocationCoordinates(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
