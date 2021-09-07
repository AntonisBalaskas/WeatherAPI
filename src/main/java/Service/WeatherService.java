package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import Coordinates.Coordinates;
import Coordinates.IpAddress;
import CurrentWeather.CurrentWeather;
import DailyWeather.DailyWeather;
import HourlyWeather.HourlyWeather;
import Utils.Constants;

public class WeatherService{

    //Attributes
    private static BufferedReader br; // reference to buffered reader
    private static HttpGet getRequest; // reference to get request
    private static HttpResponse response; // reference to response
    private static ObjectMapper mapper = new ObjectMapper(); // create object mapper
    private static CurrentWeather current; // reference to current
    private static DailyWeather daily; // reference to daily
    private static HourlyWeather hourly; // reference to hourly
    private static Coordinates coordinates; // reference to coordinates of a specific city
    private static IpAddress coordinatesIP; // reference to ip coordinates

    //getCurrent method with two parameters
    public static String getCurrentWeather(String city, String unit) {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            //find coordinates
            getRequest = new HttpGet(
                    Constants.OPENWEATHERMAP_CURRENT + "?q=" + city + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            coordinates = mapper.readValue(response.getEntity().getContent(), Coordinates.class);

            //OpenWeatherMap data
            getRequest = new HttpGet(Constants.OPENWEATHERMAP_ONECALL + "?" + coordinates.toString() + "&exclude="
                    + Constants.EXCLUDE + "&units=" + unit + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            current = mapper.readValue(response.getEntity().getContent(), CurrentWeather.class);

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.close();
        }
        if (current.getTimezone() == null) {
            return String.format("Please check the city name or your network connection");
        } else {
            return current.toString();
        }
    } //end getCurrent method by location

    //getCurrent method with one parameter with Ip detection
    public static String getCurrentIP(String unit) {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            //find IP
            URL myIP = new URL(Constants.IP_ADDRESS);
            br = new BufferedReader(new InputStreamReader(myIP.openStream()));

            //find coordinates
            getRequest = new HttpGet(
                    Constants.API_COORDINATES + br.readLine() + "?access_key=" + Constants.ACCESS_KEY + "&format=1");
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            coordinatesIP = mapper.readValue(response.getEntity().getContent(), IpAddress.class);

            //OpenWeatherMap data
            getRequest = new HttpGet(Constants.OPENWEATHERMAP_ONECALL + "?" + coordinatesIP.toString() + "&units=" + unit
                    + "&exclude=" + Constants.EXCLUDE + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            current = mapper.readValue(response.getEntity().getContent(), CurrentWeather.class);

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.close();
        }
        if (current.getTimezone() == null) {
            return String.format("Please check the city name or your network connection");
        } else {
            return current.toString();
        }
    } //end getCurrent method with Ip detection

    //getDaily method with two parameters
    public static String getDailyWeather(String city, String unit) {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            //find coordinates
            getRequest = new HttpGet(
                    Constants.OPENWEATHERMAP_CURRENT + "?q=" + city + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            coordinates = mapper.readValue(response.getEntity().getContent(), Coordinates.class);

            //OpenWeatherMap data
            getRequest = new HttpGet(Constants.OPENWEATHERMAP_ONECALL + "?" + coordinates.toString() + "&exclude="
                    + Constants.EXCLUDE + "&units=" + unit + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            daily = mapper.readValue(response.getEntity().getContent(), DailyWeather.class);

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.close();
        }
        if (daily.getTimezone() == null) {
            return String.format("Please check the city name or your network connection");
        } else {
            return daily.toString();
        }
    } //end getDaily method

    //getHourly method with two parameters
    public static String getHourlyWeather(String city, String unit) {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            //find coordinates
            getRequest = new HttpGet(
                    Constants.OPENWEATHERMAP_CURRENT + "?q=" + city + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            coordinates = mapper.readValue(response.getEntity().getContent(), Coordinates.class);

            //OpenWeatherMap data
            getRequest = new HttpGet(Constants.OPENWEATHERMAP_ONECALL + "?" + coordinates.toString() + "&exclude="
                    + Constants.EXCLUDE + "&units=" + unit + "&appid=" + Constants.OPENWEATHERMAP_API_KEY);
            getRequest.addHeader("accept", "application/json");
            response = httpClient.execute(getRequest);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            hourly = mapper.readValue(response.getEntity().getContent(), HourlyWeather.class);

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.close();
        }
        if (hourly.getTimezone() == null) {
            return String.format("Please check the city name or your network connection");
        } else {
            return hourly.toString();
        }
    }// end getHourly method
}
