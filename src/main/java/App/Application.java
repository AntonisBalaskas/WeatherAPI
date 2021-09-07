package App;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Service.WeatherService;

public class Application {


    public static void main(String[] args) {
        // TODO Auto-generated method stub\

        System.out.println("Welcome to WeatherAPP!");

        while (true) {
            System.out.println("Select one of the following options:");
            System.out.println("1. Current weather forecast in the city where the user is located");
            System.out.println("2. Current weather forecast in the city which the user enters");
            System.out.println("3. Hourly weather forecast for the next 3 days in the city which the user enters");
            System.out.println("4. Daily weather forecast for the next 5 days in the city which the user enters");
            System.out.println("5. Converting units of temperature (Celsius to Fahrenheit and opposite)");
            System.out.println("6. Exit");
            System.out.println("Your choice: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            ArrayList<String> citieslist = new ArrayList<String>();
            System.out.println("Your choice: " + input);
            switch (input) {

                case "1":
                    System.out.println("Selected 1.");
                    try {
                        String currentLocale = Locale.getDefault().getDisplayCountry();
                        String results;
                        results = WeatherService.getCurrentIP("metric");
                        System.out.println("Results are:");
                        System.out.println(results);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                case "2":
                    System.out.println("Selected 2.");
                    System.out.println("Enter city: ");
                    try {
                        final String cityInput = sc.nextLine();
                        final String results = WeatherService.getCurrentWeather(cityInput, "metric");
                        citieslist.add(cityInput);
                        System.out.println("Results are: ");
                        System.out.println(results);
                        System.out.println(citieslist);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("Selected 3.");
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
                    try {
                        final String results = WeatherService.getHourlyWeather(city, "metric");
                        System.out.println("Results are: ");
                        System.out.println(results);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;
                case "4":
                    System.out.println("Selected 4.");
                    System.out.print("Enter city: ");
                    city = sc.nextLine();
                    int day;
                    try {
                        for (day = 1; day <= 5; day++) {
                            final String results = WeatherService.getDailyWeather(city, "metric");
                            System.out.println("Results are: ");
                            System.out.println(results);
                            break;
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "5":
                    System.out.println("Selected 5.");
                    Scanner scaleInput = new Scanner(System.in);
                    System.out.println("Enter F to convert Farenheit or enter C to convert to Celcius");
                    char temperatureScale = scaleInput.next().charAt(0);
                    System.out.println("Now enter the temperature value:");
                    Scanner tempInput = new Scanner(System.in);
                    double temp = tempInput.nextInt();

                    if (temperatureScale == 'F') {
                        farenheitConverter(temp);
                    } else {
                        celciusConverter(temp);
                    }
                    break;
                case "6":
                    System.out.println("Selected 6.");
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
        System.out.println(tempCelcius + " F Degrees");
    }

    private static void farenheitConverter(double tempFarenheit) {
        // TODO Auto-generated method stub
        tempFarenheit = ((tempFarenheit - 32) * 0.5556);
        System.out.println(tempFarenheit + " C Degrees");
    }

}

