import services.WeatherAPIService;

public class WeatherAPI {
	
	public static services.WeatherAPIService getOpenWeatherMapService() {
		// API key needed. Register and generate API KEY
		return new services.WeatherAPIService("https://openweathermap.org/", "1e2251421888e962483847c3e0621a49");
	}
	
}