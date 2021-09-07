package HourlyWeather;

import java.util.Date; //uses class Date
import java.util.List; //uses class List
import com.fasterxml.jackson.annotation.JsonProperty;

public class HourlyWeatherInfo {

    //Attributes
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("feels_like")
    private double feels_like;
    @JsonProperty("pressure")
    private long pressure;
    @JsonProperty("humidity")
    private long humidity;
    @JsonProperty("dew_point")
    private double dew_point;
    @JsonProperty("uvi")
    private double uvi;
    @JsonProperty("clouds")
    private long clouds;
    @JsonProperty("visibility")
    private long visibility;
    @JsonProperty("wind_speed")
    private double wind_speed;
    @JsonProperty("wind_deg")
    private long wind_deg;
    @JsonProperty("weather")
    private List<HourlyWeatherDescr> weather = null;
    @JsonProperty("pop")
    private double pop;
    @JsonProperty("snow")
    private Snow snow;
    private Date date;

    //constructor for use in serialization
    public HourlyWeatherInfo() {
    } //end of constructor

    //constructor
    public HourlyWeatherInfo(long dt, double temp, double feels_like, long pressure, long humidity, double dew_point,
                      double uvi, long clouds, long visibility, double wind_speed, long wind_deg, List<HourlyWeatherDescr> weather,
                      double pop, Snow snow, Date date) {
        super();
        this.dt = dt;
        this.temp = temp;
        this.feels_like = feels_like;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dew_point = dew_point;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.wind_speed = wind_speed;
        this.wind_deg = wind_deg;
        this.weather = weather;
        this.pop = pop;
        this.snow = snow;
        this.date = date;
    } //end of constructor

    //setters and getters
    //get dt
    public long getDt() {
        return dt;
    }

    //set dt
    public void setDt(long dt) {
        this.dt = dt;
    }

    //get temperature
    public double getTemp() {
        return temp;
    }

    //set temperature
    public void setTemp(double temp) {
        this.temp = temp;
    }

    //get feels_like
    public double getFeels_like() {
        return feels_like;
    }

    //set feels_like
    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    //get pressure
    public long getPressure() {
        return pressure;
    }

    //set pressure
    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    //get humidity
    public long getHumidity() {
        return humidity;
    }

    //set humidity
    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    //get dew_point
    public double getDew_point() {
        return dew_point;
    }

    //set dew_point
    public void setDew_point(double dew_point) {
        this.dew_point = dew_point;
    }

    //get uvi
    public double getUvi() {
        return uvi;
    }

    //set uvi
    public void setUvi(double uvi) {
        this.uvi = uvi;
    }

    //get clouds
    public long getClouds() {
        return clouds;
    }

    //set clouds
    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    //get visibility
    public long getVisibility() {
        return visibility;
    }

    //set visibility
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    //get wind_speed
    public double getWind_speed() {
        return wind_speed;
    }

    //set wind_speed
    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    //get wind_deg
    public long getWind_deg() {
        return wind_deg;
    }

    //set wind_deg
    public void setWind_deg(long wind_deg) {
        this.wind_deg = wind_deg;
    }

    //get weather
    public List<HourlyWeatherDescr> getWeather() {
        return weather;
    }

    //set weather
    public void setWeather(List<HourlyWeatherDescr> weather) {
        this.weather = weather;
    }

    //get pop
    public double getPop() {
        return pop;
    }

    //set pop
    public void setPop(double pop) {
        this.pop = pop;
    }

    //get snow
    public Snow getSnow() {
        return snow;
    }

    //set snow
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    //get Datetime
    public Date getDate() {
        date = new Date(dt * 1000);
        return date;
    }

    //set Datetime
    public void setDate(Date date) {
        this.date = date;
    }
    //end setters and getters

    //return a string containing only needed hourly temperature information
    @Override
    public String toString() {
        return String.format("\n%2s: %8.2f %12s", getDate(), getTemp(), getWeather());
    } //end method toString
}