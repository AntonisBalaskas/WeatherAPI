package WeatherTest;

import static org.junit.Assert.*;

import CurrentWeather.CurrentWeather;
import DailyWeather.DailyWeather;
import HourlyWeather.HourlyWeather;
import Service.WeatherService;
import org.junit.Test;

public class WeatherTest {

    //testing current object to return current weather by detecting the IP
    //method CurrentForecast_ByIp
    @Test
    public void CurrentForecast_ByIp() {

        String current = WeatherService.getCurrentIP("metric");

        assertFalse(CurrentWeather.isEmpty());

        System.out.printf("\n\nCurrent weather by Ip detection in Celsius: \n\n%s", current);
    } //end method CurrentForecast_ByIp

    //testing daily object to return daily weather
    //method DailyForecast_InSydney
    @Test
    public void DailyForecast_InSydney() {

        String daily = WeatherService.getDailyWeather("Sydney", "imperial");

        assertFalse(DailyWeather.isEmpty());

        System.out.printf("\n\nDaily weather in Sydney in Fahrenheit: \n\n%s", daily);
    } //end method DailyForecast_InSydney

    //testing hourly object to return hourly temperature
    //method HourlyForecast_InNeaTiryntha
    @Test
    public void HourlyForecast_InNeaTiryntha() {

        String hourly = WeatherService.getHourlyWeather("Nea%20Tiryntha", "metric");

        assertFalse(HourlyWeather.isEmpty());

        System.out.printf("\n\nHourly weather in Nea Tiryntha in Celsius: \n\n%s", hourly);
    } //end method HourlyForecast_InNeaTiryntha

    //testing current object to return current weather
    //method CurrentForecast_InCelsiusDegrees
    @Test
    public void CurrentForecast_InCelsiusDegrees() {

        String current = WeatherService.getCurrentWeather("Nea%20Tiryntha", "metric");

        assertFalse(CurrentWeather.isEmpty());

        System.out.printf("\n\nCurrent weather in Nea Tiryntha in Celsius: \n\n%s", current);
    } //end method CurrentForecast_InCelsiusDegrees
}
