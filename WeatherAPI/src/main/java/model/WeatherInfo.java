package model;

import model.openweathermap.Result;

public class WeatherInfo {
	private double temp; //temperature
	private double temp_min; //minimum current temperature in the city
	private double temp_max; //maximum current temperature in the city
	private double humidity; 
	private double wind_speed;
    private String weather_description;
    private int hour;
	private double day; //daily averaged temperature
	
	 public WeatherInfo(double temp,double temp_min,double temp_max,double humidity,double wind_speed,int hour, String weather_description,double day) {
			this.temp=temp;
			this.temp_min=temp_min;
			this.temp_max=temp_max;
			this.humidity=humidity;
			this.wind_speed=wind_speed;
			this.weather_description=weather_description;
			this.hour=hour;
			this.day=day;
	 }
	
	 public WeatherInfo(WeatherInfo theResult) {
			this.temp = theResult.getTemp();
			this.temp_min = theResult.getTemp_min();
			this.temp_max = theResult.getTemp_max();
			this.humidity = theResult.getHumidity();
			this.wind_speed=theResult.getWind_speed();
			this.weather_description=theResult.getWeather_description();
			this.hour=theResult.getHour();
			this.day=theResult.getDay();
			
		}
	 
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
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
	public String getWeather_description() {
		return weather_description;
	}
	public void setWeather_description(String weather_description) {
		this.weather_description = weather_description;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
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
	", temp_min='" + temp_min + "'\n" +
	", temp_max='" + temp_max + "'\n" +
	", humidity='" + humidity + "'\n" +
	", wind_speed='" + wind_speed + "'\n" +
	", weather_description='" + weather_description + "'\n" +
	", hour='" + hour + "'\n" +
	", day='" + day + "'\n" +
	'}';
}
	

}
