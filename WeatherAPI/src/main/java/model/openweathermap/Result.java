package model.openweathermap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp",
    "temp_min",
    "temp_max",
    "humidity",
    "wind_speed",
    "weather_description",
    "hour",
    "day"  
})
public class Result {

    @JsonProperty("temp")
    private Double temp;
    @JsonProperty("temp_min")
    private Double temp_min;
    @JsonProperty("temp_max")
    private Double temp_max;
    @JsonProperty("humidity")
    private Double humidity;
    @JsonProperty("wind_speed")
    private Double wind_speed;
    @JsonProperty("weather_description")
    private String weather_description;
    @JsonProperty("hour")
    private Integer hour;
    @JsonProperty("day")
    private Double day;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @JsonProperty("temp_min")
    public Double getTemp_min() {
        return temp_min;
    }

    @JsonProperty("temp_min")
    public void setTemp_min(Double temp_min) {
        this.temp_min = temp_min;
    }

    @JsonProperty("temp_max")
    public Double getTemp_max() {
        return temp_max;
    }

    @JsonProperty("temp_max")
    public void setTemp_max(Double temp_max) {
        this.temp_max = temp_max;
    }

    @JsonProperty("humidity")
    public Double getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("wind_speed")
    public Double getWind_Speed() {
        return wind_speed;
    }

    @JsonProperty("wind_speed")
    public void setWind_Speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    @JsonProperty("weather_description")
    public String weather_description() {
        return weather_description;
    }

    @JsonProperty("weather_description")
    public void setWeather_Description(String weather_description) {
        this.weather_description = weather_description;
    }

    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    @JsonProperty("day")
    public Double getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Double day) {
        this.day = day;
    }
    
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
