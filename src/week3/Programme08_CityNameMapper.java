package week3;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme08_CityNameMapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char inputChar = scanner.next().toUpperCase().charAt(0);

        String cityName;

        if (inputChar == 'A') {
            cityName = "Amsterdam";
        } else if (inputChar == 'B') {
            cityName = "Berlin";
        } else if (inputChar == 'C') {
            cityName = "Cairo";
        } else if (inputChar == 'D') {
            cityName = "Delhi";
        } else if (inputChar == 'E') {
            cityName = "Edinburgh";
        } else if (inputChar == 'F') {
            cityName = "Florence";
        } else {
            cityName = "Invalid entry. Please enter an alphabet from A to F.";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
