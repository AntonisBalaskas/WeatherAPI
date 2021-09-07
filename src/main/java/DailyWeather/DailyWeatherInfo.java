package DailyWeather;

import java.util.Date;
import java.util.List; //uses class List
import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyWeatherInfo {

    //Attributes
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
    @JsonProperty("temp")
    private DailyTemp temp;
    @JsonProperty("feels_like")
    private FeelsLike feels_like;
    @JsonProperty("pressure")
    private long pressure;
    @JsonProperty("humidity")
    private long humidity;
    @JsonProperty("dew_point")
    private double dew_point;
    @JsonProperty("wind_speed")
    private double windSpeed;
    @JsonProperty("wind_deg")
    private long windDeg;
    @JsonProperty("weather")
    private List<DailyWeatherDescr> weather = null;
    @JsonProperty("clouds")
    private long clouds;
    @JsonProperty("pop")
    private double pop;
    @JsonProperty("snow")
    private double snow;
    @JsonProperty("uvi")
    private double uvi;
    private Date date;

    //constructor for use in serialization
    public DailyWeatherInfo() {
    } // end of constructor

    //constructor
    public DailyWeatherInfo(long dt, long sunrise, long sunset, DailyTemp temp, FeelsLike feels_like, long pressure,
                     long humidity, double dew_point, double windSpeed, long windDeg, List<DailyWeatherDescr> weather, long clouds,
                     double pop, double snow, double uvi, Date date) {
        super();
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.temp = temp;
        this.feels_like = feels_like;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dew_point = dew_point;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.weather = weather;
        this.clouds = clouds;
        this.pop = pop;
        this.snow = snow;
        this.uvi = uvi;
        this.date = date;
    } //end of constructor

    //setters and getters
    //get current time
    public long getDt() {
        return dt;
    }

    //set current time
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

    //get temperature
    public DailyTemp getTemp() {
        return temp;
    }

    //set temperature
    public void setTemp(DailyTemp temp) {
        this.temp = temp;
    }

    //get feels like
    public FeelsLike getFeelsLike() {
        return feels_like;
    }

    //set feels like
    public void setFeelsLike(FeelsLike feels_like) {
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
    public List<DailyWeatherDescr> getWeather() {
        return weather;
    }

    //set weather
    public void setWeather(List<DailyWeatherDescr> weather) {
        this.weather = weather;
    }

    //get clouds
    public long getClouds() {
        return clouds;
    }

    //set clouds
    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    //get probability of precipitation
    public double getPop() {
        return pop;
    }

    //set probability of precipitation
    public void setPop(double pop) {
        this.pop = pop;
    }

    //get snow
    public double getSnow() {
        return snow;
    }

    //set snow
    public void setSnow(Double snow) {
        this.snow = snow;
    }

    //get uvi
    public double getUvi() {
        return uvi;
    }

    //set uvi
    public void setUvi(Double uvi) {
        this.uvi = uvi;
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

    //return a string containing only the needed daily information
    @Override
    public String toString() {
        return String.format(
                "\n\nDatetime: %4s \nTemperature: %4s \nFeels like: %4s \nWeather: %2s \nProbability of Precipitation: %.2f \nHumidity: %2d%% \nPressure: %d \nWind Speed: %2.2f \nWind Destination:%2d \nClouds: %2d%%",
                getDate(), getTemp(), getFeelsLike(), getWeather(), getPop(), getHumidity(), getPressure(), getWindSpeed(),
                getWindDeg(), getClouds());
    } //end method toString
}
