package DailyWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeelsLike {

    //Attributes
    @JsonProperty("day")
    private double day;
    @JsonProperty("night")
    private double night;
    @JsonProperty("eve")
    private double eve;
    @JsonProperty("morn")
    private double morn;

    //constructor for use in serialization
    public FeelsLike() {
    } // end of constructor

    //constructor
    public FeelsLike(double day, double night, double eve, double morn) {
        super();
        this.day = day;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    } //end of constructor

    //setters and getters
    //get day temperature
    public double getDay() {
        return day;
    }

    //set day temperature
    public void setDay(double day) {
        this.day = day;
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

    //return a string containing feels like information
    @Override
    public String toString() {
        return String.format("Day:%2.2f, Night:%2.2f, Evening:%2.2f, Morning:%2.2f", getDay(), getNight(), getEve(),
                getMorn());
    } //end method toString
}
