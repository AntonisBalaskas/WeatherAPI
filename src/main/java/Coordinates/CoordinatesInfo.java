package Coordinates;

import com.fasterxml.jackson.annotation.JsonProperty; //uses JsonProperty

public class CoordinatesInfo {

    //Attributes
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("lat")
    private static double lat;

    //constructor for use in serialization
    public CoordinatesInfo() {
    } //end of constructor

    //constructor
    public CoordinatesInfo(double lon, double lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    } //end of constructor

    //setters and getters
    //get longitude
    public double getLon() {
        return lon;
    }

    //set longitude
    public void setLon(double lon) {
        this.lon = lon;
    }

    //get latitude
    public double getLat() {
        return lat;
    }

    //set latitude
    public void setLat(double lat) {
        this.lat = lat;
    }
    //end setters and getters

    //return a string containing longitude and latitude information
    @Override
    public String toString() {
        return String.format("lat=%.4f&lon=%.4f", getLat(), getLon());
    }
    // end method toString
}
