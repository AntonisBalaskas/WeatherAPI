package gr.unipi.weatherapp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import gr.unipi.weatherapi.exception.WeatherAPIException;
import gr.unipi.weatherapi.model.WeatherAPI;
import gr.unipi.weatherapi.model.WeatherInfo;
import gr.unipi.weatherapi.services.WeatherAPIService;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final WeatherAPIService WeatherAPIService = WeatherAPI.getWeatherAPIService();
		System.out.println("Welcome to WeatherAPP");
		
		while(true) {
			System.out.println("Select one of the following options:");
			System.out.println("1.List of cities for which user want to receive weather data");
			System.out.println("2.Current weather conditions prevailing in the city where the user is located (specified automatically)");
			System.out.println("3.Current weather conditions prevailing in one of the registered cities (selected from the user list)");
			System.out.println("4.Current weather conditions prevailing in any other city the user selects (given by the keyboard)");
			System.out.println("5.Hourly weather forecast of the city which is selected by the user for some days(these days will be specific and depends on the implementation it will have held in the Weather API library of the 1st part of the work)");
			System.out.println("6.Daily weather forecast of the city which is selected by the user for the next 5 days");
			System.out.println("7.Choose units of temperature measurement (Celsius or Fahrenheit)");
			System.out.println("8.Exit");
			System.out.println("Your choice:");
			
			Scanner sc= new Scanner(System.in);
			String input = sc.nextLine();
			
			System.out.println("Your choice: " + input);
			switch (input) {
			
			case "1":
			 System.out.println("Selected 1.");
			 System.out.println("Enter city:");
			 try {
				    final String cityInput = sc.nextLine();
					List<WeatherInfo> results;
					results = WeatherAPIService.getCurrentWeather(cityInput);
					ArrayList<String> citieslist= new ArrayList<String>();
					citieslist.add(cityInput);
					System.out.println("Results are: ");
					System.out.println(results);
					System.out.println(citieslist);
			 } catch (WeatherAPIException e) {
					System.err.println(e.getMessage());
				}
				
				break;

			case "2":
		     System.out.println("Selected 2.");
		     System.out.print("Enter id: ");
				String id = sc.nextLine();
				try {
					final List<WeatherInfo> results = WeatherAPIService.searchCurrentWeather(id);
					System.out.println("Results are: ");
					System.out.println(results);
				} catch (WeatherAPIException e) {
					System.err.println(e.getMessage());
				}
		     break;
			case "3":
			 System.out.println("Selected 3.");
			 System.out.println("Enter city:");
			 try {
				    final String cityInput = sc.nextLine();
				    List<WeatherInfo> results;
					results = WeatherAPIService.getCurrentWeather(cityInput);
					System.out.println("Results are: ");
					System.out.println(results);
			 } catch (WeatherAPIException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case "4":
				 System.out.println("Selected 4.");
				 System.out.println("Enter city:");
				 try {
					    final String cityInput = sc.nextLine();
					    List<WeatherInfo> results;
						results = WeatherAPIService.getCurrentWeather(cityInput);
						System.out.println("Results are: ");
						System.out.println(results);
				 } catch (WeatherAPIException e) {
						System.err.println(e.getMessage());
					}
			
			 break;
			case "5":
			 System.out.println("Selected 5.");
			     System.out.print("Enter city: ");
					String city = sc.nextLine();
					try {
						final List<WeatherInfo> results = WeatherAPIService.getdtWeather(city);
						System.out.println("Results are: ");
						System.out.println(results);
					} catch (WeatherAPIException e) {
						System.err.println(e.getMessage());
					}
			 break;
			case "6":
			 System.out.println("Selected 6.");
		     System.out.print("Enter city: ");
				city = sc.nextLine();
                int day;
				try {
					for ( day=1; day<=5; day++) {
					final List<WeatherInfo> results = WeatherAPIService.getDailyWeather(city);
					System.out.println("Results are: ");
					System.out.println(results);
					}
				} catch (WeatherAPIException e) {
					System.err.println(e.getMessage());
				}
			 break;
			case "7":
				System.out.println("Selected 7.");
			    Scanner scaleInput = new Scanner(System.in);
		        System.out.println("Enter F to convert Farenheit or enter C to convert to Celcius");
		        char temperatureScale = scaleInput.next().charAt(0);
		        System.out.println("Now enter the temperature value:");
		        Scanner tempInput = new Scanner(System.in);
		        double temp = tempInput.nextInt();

		       if (temperatureScale == 'F'){
		           farenheitConverter(temp);
		       }
		    else {
		        celciusConverter(temp);
		       }
			 break;
			case "8":
			 System.out.println("Selected 8.");
				System.exit(0);
				break;

			default:
				System.err.println("Invalid input.");
			}
		}

	}

	private static void celciusConverter(double tempCelcius) {
		// TODO Auto-generated method stub
		tempCelcius = ((tempCelcius * 1.8) + 32);
        System.out.println(tempCelcius +" F Degrees");
	}

	private static void farenheitConverter(double tempFarenheit) {
		// TODO Auto-generated method stub
		tempFarenheit = ((tempFarenheit - 32) * 0.5556);
        System.out.println(tempFarenheit +" C Degrees");
	}

}
