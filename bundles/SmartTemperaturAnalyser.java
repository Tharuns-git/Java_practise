package bundles;
import java.util.Scanner;

public class SmartTemperaturAnalyser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature in Celsius:");
        double temp = sc.nextDouble();

        System.out.println("Enter the Humidity percentage:");
        double humidity = sc.nextDouble();

        System.out.println("Enter the windspeed in Km/hr:");
        int windspeed = sc.nextInt();

        // Celsius to Fahrenheit
        double fahrenheit = (temp * 9 / 5) + 32;

        System.out.println("Temperature: " + temp + "°C");
        System.out.println("Converted: " + fahrenheit + "°F");

        // Weather Category
        if (temp < 10) {
            System.out.println("Category: Cold");
        } 
        else if (temp <= 25) {
            System.out.println("Category: Moderate");
        } 
        else {
            System.out.println("Category: Hot");
        }

        // Heat Alert
        if (humidity > 80 && temp > 30) {
            System.out.println("Alert: Heat Alert");
        }

        // Weather Warning
        if (windspeed > 40 || temp < 5) {
            System.out.println("Alert: Weather Warning");
        }

        sc.close();
    }
}