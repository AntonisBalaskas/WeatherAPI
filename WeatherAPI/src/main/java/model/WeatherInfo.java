package model;

import model.openweathermap.Result;

public class WeatherInfo {
	private double temp; //temperature
	private double min; //minimum current temperature in the city
	private double max; //maximum current temperature in the city
	private double humidity; 
	private double wind_speed;
    private String description;
    private double dt;
	private double day; //daily averaged temperature
	
	 public WeatherInfo(double temp,double min,double max,double humidity,double wind_speed,double dt, String description,double day) {
			this.temp=temp;
			this.min=min;
			this.max=max;
			this.humidity=humidity;
			this.wind_speed=wind_speed;
			this.description=description;
			this.dt=dt;
			this.day=day;
	 }
	
	 public WeatherInfo(WeatherInfo theAlerts) {
			this.temp = theAlerts.getTemp();
			this.min = theAlerts.getMin();
			this.max = theAlerts.getMax();
			this.humidity = theAlerts.getHumidity();
			this.wind_speed=theAlerts.getWind_speed();
			this.description=theAlerts.getDescription();
			this.dt=theAlerts.getDt();
			this.day=theAlerts.getDay();
			
		}
	 
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	public double getDay() {
		return day;
	}
	public void setDay(double day) {
		this.day = day;
	}
	
	@Override 
	public String toString() {
		return "WeatherInfo{" +
	"temp='" + temp + "'\n" +
	", min='" + min + "'\n" +
	", max='" + max + "'\n" +
	", humidity='" + humidity + "'\n" + 
	", wind_speed='" + wind_speed + "'\n" +
	", description='" + description + "'\n" +
	", dt='" + dt + "'\n" +
	", day='" + day + "'\n" +
	'}';
}
	

}
