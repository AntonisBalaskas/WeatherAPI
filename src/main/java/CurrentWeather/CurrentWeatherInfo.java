package CurrentWeather;

import java.util.Date; //uses class Date
import java.util.List; //uses class List

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeatherInfo {

    //Attributes
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;
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
    private double windSpeed;
    @JsonProperty("wind_deg")
    private long windDeg;
    @JsonProperty("weather")
    private List<CurrentWeatherDescr> weather;
    private Date date;

    //constructor for use in serialization
    public CurrentWeatherInfo() {
    } // end of constructor

    //constructor
    public CurrentWeatherInfo(long dt, long sunrise, long sunset, double temp, double feelsLike, long pressure, long humidity,
                              double dew_point, double uvi, long clouds, long visibility, double windSpeed, long windDeg,
                              List<CurrentWeatherDescr> weather, Date date) {
        super();
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dew_point = dew_point;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.weather = weather;
        this.date = date;
    } // end of constructor

    //setters and getters
    //get dt
    public long getDt() {
        return dt;
    }

    //set dt
    public void setDt(long dt) {
        this.dt = dt;
    }

    //get sunrise
    public long getSunrise() {
        return sunrise;
    }

    //set sunrise
    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    //get sunset
    public long getSunset() {
        return sunset;
    }

    //set sunset
    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    // get temperature
    public double getTemp() {
        return temp;
    }

    //set sunrise
    public void setTemp(double temp) {
        this.temp = temp;
    }

    //get feels like
    public double getFeelsLike() {
        return feelsLike;
    }

    //set feels like
    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
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

    //set pressure
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

    //get wind speed
    public double getWindSpeed() {
        return windSpeed;
    }

    //set wind speed
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    //get wind destination
    public long getWindDeg() {
        return windDeg;
    }

    //set wind destination
    public void setWindDeg(long windDeg) {
        this.windDeg = windDeg;
    }

    //get weather
    public List<CurrentWeatherDescr> getWeather() {
        return weather;
    }

    //set weather
    public void setWeather(List<CurrentWeatherDescr> weather) {
        this.weather = weather;
    }

    //get datetime
    public Date getDate() {
        date = new Date(dt * 1000);
        return date;
    }

    //set datetime
    public void setDate(Date date) {
        this.date = date;
    }
    //end setters and getters

    //return a string containing only needed current temperature information
    @Override
    public String toString() {
        return String.format(
                "Datetime: %s \nTemperature: %.2f \nFeels Like: %.2f \nPressure: %d \nHumidity: %d%% \nClouds: %d%% \nVisibility: %d \nWind Speed: %.2f \nWind Direction: %d \nWeather: %2s",
                getDate(), getTemp(), getFeelsLike(), getPressure(), getHumidity(), getClouds(), getVisibility(),
                getWindSpeed(), getWindDeg(), getWeather());
    } //end method toString
}