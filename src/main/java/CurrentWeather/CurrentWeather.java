package CurrentWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeather {

    //Attributes
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("time_offset")
    private long timezone_offset;
    @JsonProperty("current")
    private CurrentWeatherInfo current; //reference to current

    //constructor for use in serialization
    public CurrentWeather() {
    } //end of constructor

    //constructor
    public CurrentWeather(double lat, double lon, String timezone, long timezone_offset, CurrentWeatherInfo current) {
        super();
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezone_offset = timezone_offset;
        this.current = current;
    } //end of constructor

    public static boolean isEmpty() {
        return false;
    }

    //setters and getters
    //get lat
    public double getLat() {
        return lat;
    }

    //set lat
    public void setLat(double lat) {
        this.lat = lat;
    }

    //get lon
    public double getLon() {
        return lon;
    }

    //set lon
    public void setLon(double lon) {
        this.lon = lon;
    }

    //get timezone
    public String getTimezone() {
        return timezone;
    }

    //set timezone
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    //get timezone_offset
    public long getTimezone_offset() {
        return timezone_offset;
    }

    //set timezone_offset
    public void setTimezone_offset(long timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    //get current information
    public CurrentWeatherInfo getCurrent() {
        return current;
    }

    //set current information
    public void setCurrent(CurrentWeatherInfo current) {
        this.current = current;
    }
    //end setters and getters

    //return a string containing only needed current information
    @Override
    public String toString() {
        return String.format("Timezone: %2s \n%2s ", getTimezone(), getCurrent());
    } //end method toString
}
