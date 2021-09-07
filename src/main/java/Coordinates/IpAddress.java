package Coordinates;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpAddress {

    //Attributes
    @JsonProperty("longitude")
    private double lon;
    @JsonProperty("latitude")
    private double lat;

    //constructor
    public IpAddress() {
    } //end of constructor

    //constructor
    public IpAddress(double lon, double lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    } //end of constructor

    // get longitude
    public double getLon() {
        return lon;
    }

    // set longitude
    public void setLon(double lon) {
        this.lon = lon;
    }

    // get latitude
    public double getLat() {
        return lat;
    }

    // set latitude
    public void setLat(double lat) {
        this.lat = lat;
    }

    // return a string containing longitude and latitude information
    @Override
    public String toString() {
        return String.format("lat=%.4f&lon=%.4f", getLat(), getLon());
    }
    // end method toString
}
