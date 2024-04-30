package week3;

import java.util.Scanner;

/**
 * 9. Input any alphabet from “A" to “F” and print their city name accordingly (use switch case) if
 * any other alphabet should be invalid entry
 */
public class Programme09_CityNameMapperUsingSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        String input = scanner.next().toUpperCase();

        String cityName;

        switch (input) {
            case "A":
                cityName = "Amsterdam";
                break;
            case "B":
                cityName = "Berlin";
                break;
            case "C":
                cityName = "Cairo";
                break;
            case "D":
                cityName = "Delhi";
                break;
            case "E":
                cityName = "Edinburgh";
                break;
            case "F":
                cityName = "Florence";
                break;
            default:
                cityName = "Invalid entry. Please enter an alphabet from A to F.";
                break;
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}