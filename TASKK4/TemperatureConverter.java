import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = 0.0;
        int choice = 0;

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());

                if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                }

                System.out.print("Enter temperature: ");
                temperature = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case 1:
                        double fahrenheit = celsiusToFahrenheit(temperature);
                        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                        break;
                    case 2:
                        double celsius = fahrenheitToCelsius(temperature);
                        System.out.println("Temperature in Celsius: " + celsius);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        }
        scanner.close();
    }
}
