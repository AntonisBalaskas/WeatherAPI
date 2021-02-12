import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.WeatherAPIException;
import model.WeatherInfo;
import services.WeatherAPIService;

public class WeatherAPITest {


	@Test
	public void testWeatherAPI() throws WeatherAPIException {
		final WeatherAPIService weatherSearchService = WeatherAPI.getOpenWeatherMapService();
		final List<WeatherInfo> alerts = weatherSearchService.getWeatherInfo("Athens");
		Assert.assertFalse(alerts.isEmpty());
		alerts.forEach(System.out::println);
}
}
