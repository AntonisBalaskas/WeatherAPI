package DailyWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyTemp {

    //Attributes
    @JsonProperty("day")
    private double day;
    @JsonProperty("min")
    private double min;
    @JsonProperty("max")
    private double max;
    @JsonProperty("night")
    private double night;
    @JsonProperty("eve")
    private double eve;
    @JsonProperty("morn")
    private double morn;

    //constructor for use in serialization
    public DailyTemp() {
    } //end of constructor

    //constructor
    public DailyTemp(double day, double min, double max, double night, double eve, double morn) {
        super();
        this.day = day;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    } // end of constructor

    //setters and getters
    //get day temperature
    public double getDay() {
        return day;
    }

    //set day temperature
    public void setDay(double day) {
        this.day = day;
    }

    //get minimum temperature
    public double getMin() {
        return min;
    }

    //set minimum temperature
    public void setMin(double min) {
        this.min = min;
    }

    //get maximum temperature
    public double getMax() {
        return max;
    }

    //set maximum temperature
    public void setMax(double max) {
        this.max = max;
    }

    //get night temperature
    public double getNight() {
        return night;
    }

    //set night temperature
    public void setNight(double night) {
        this.night = night;
    }

    //get evening temperature
    public double getEve() {
        return eve;
    }

    //set evening temperature
    public void setEve(double eve) {
        this.eve = eve;
    }

    //get morning temperature
    public double getMorn() {
        return morn;
    }

    //set morning temperature
    public void setMorn(double morn) {
        this.morn = morn;
    }
    //end setters and getters

    //return a string containing daily temperature information
    @Override
    public String toString() {
        return String.format("Day:%2.2f, Minimum:%2.2f, Maximum:%2.2f, Night:%2.2f, Evening:%2.2f, Morning:%2.2f",
                getDay(), getMin(), getMax(), getNight(), getEve(), getMorn());
    } //end method toString
}
