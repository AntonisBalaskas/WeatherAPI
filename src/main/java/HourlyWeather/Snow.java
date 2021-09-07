package HourlyWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    //Attributes
    @JsonProperty("_1h")
    private double _1h;

    //constructor for use in serialization
    public Snow() {
    } //end of constructor

    //constructor
    public Snow(double _1h) {
        this._1h = _1h;
    }
    //end of constructor

    //get 1h
    public double get1h() {
        return _1h;
    }

    //set 1h
    public void set1h(double _1h) {
        this._1h = _1h;
    }

    //return a string containing only needed hourly temperature information
    @Override
    public String toString() {
        return String.format("\n%4.2f ", get1h());
    }
    //end method toString
}
