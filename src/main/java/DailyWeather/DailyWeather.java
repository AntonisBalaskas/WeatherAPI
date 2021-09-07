package DailyWeather;

import java.util.List; //uses class List

import com.fasterxml.jackson.annotation.JsonProperty;

import CurrentWeather.CurrentWeatherInfo;

public class DailyWeather {

    //Attributes
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("time_offset")
    private long timezone_offset;
    @JsonProperty("daily")
    private List<DailyWeatherInfo> daily;
    @JsonProperty("current")
    private CurrentWeatherInfo current; //reference to CurrentWeather

    //constructor for use in serialization
    public DailyWeather() {
    } //end of constructor

    //constructor
    public DailyWeather(double lat, double lon, String timezone, long timezone_offset, List<DailyWeatherInfo> daily) {
        super();
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezone_offset = timezone_offset;
        this.daily = daily;
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

    //get daily information
    public List<DailyWeatherInfo> getDaily() {
        return daily.subList(0, 5);
    }

    //set daily information
    public void setDaily(List<DailyWeatherInfo> daily) {
        this.daily = daily;
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

    //return a string containing only the needed daily information
    @Override
    public String toString() {
        return String.format("Timezone:%s \nCurrent Temperature\n%s \n\nDaily:%s", getTimezone(), getCurrent(),
                getDaily());
    } //end method toString
}