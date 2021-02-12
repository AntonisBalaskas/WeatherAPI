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
		final List<WeatherInfo> results = weatherSearchService.getWeatherInfo("Athens");
		Assert.assertFalse(results.isEmpty());
		results.forEach(System.out::println);
}
}
