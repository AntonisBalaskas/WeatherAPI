package HourlyWeather;

import java.util.List; //uses class List
import com.fasterxml.jackson.annotation.JsonProperty;

public class HourlyWeather {

    //Attributes
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezone_offset")
    private long timezone_offset;
    @JsonProperty("hourly")
    private List<HourlyWeatherInfo> hourly = null;

    //constructor for use in serialization
    public HourlyWeather() {
    }//end of constructor

    //constructor
    public HourlyWeather(double lat, double lon, String timezone, long timezone_offset, List<HourlyWeatherInfo> hourly) {
        super();
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezone_offset = timezone_offset;
        this.hourly = hourly;
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

    //get time_offset
    public long getTime_offset() {
        return timezone_offset;
    }

    //set time_offset
    public void setTime_offset(long timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    //get hourly information
    public List<HourlyWeatherInfo> getHourly() {
        return hourly;
    }

    //set hourly information
    public void setHourly(List<HourlyWeatherInfo> hourly) {
        this.hourly = hourly;
    }

    //return a string containing daily information
    @Override
    public String toString() {
        return String.format("\nTimeZone:%s \nHourly:%s\n", getTimezone(), getHourly());
    } //end toString method
}
