package services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.ExtendedResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import exception.WeatherAPIException;
import model.WeatherInfo;
import model.openweathermap.Alert;
import model.openweathermap.ErrorResponse;
import model.openweathermap.Weather;
import model.openweathermap.WeatherResult;

public class WeatherAPIService {
	private final String API_URL;
	private final String API_KEY;

	public WeatherAPIService(String API_URL, String API_KEY) {
		this.API_URL = API_URL;
		this.API_KEY = API_KEY;
	}

	public List<WeatherInfo> getWeatherInfo(String onecall) throws WeatherAPIException {
		WeatherResult alerts = getAPIData("onecall", "hourly", API_URL, API_KEY);
		List<WeatherInfo> weatherInfoList = new ArrayList<>(alerts.getAlerts().size());
		for (Alert theAlerts : Alert.getAlerts()) {
			weatherInfoList.add(new WeatherInfo(theAlerts));
		}
		return weatherInfoList;

	}

	private WeatherResult getAPIData(String apiFunction, String parameter, String API_URL, String API_KEY)
			throws WeatherAPIException {
		try {
			final URIBuilder uriBuilder = new URIBuilder(API_URL).setPathSegments("2.5", apiFunction, "weather")
					.addParameter("api_key", API_KEY);
			if (parameter != null && !parameter.isBlank()) {
				switch (apiFunction) {
				case "onecall":
					uriBuilder.addParameter("query", parameter);
					break;

				}
			}

			final URI uri = uriBuilder.build();

			final HttpGet getRequest = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getStatusMessage() != null)
						throw new WeatherAPIException("Error occured on API call: " + errorResponse.getStatusMessage());
				}
				return mapper.readValue(entity.getContent(), WeatherResult.class);
			} catch (IOException e) {
				throw new WeatherAPIException("Error requesting data from the OpenWeatherMap API.", e);
			}
		} catch (URISyntaxException e) {
			throw new WeatherAPIException("Unable to create request URI.", e);
		}
	}

	

	



}
