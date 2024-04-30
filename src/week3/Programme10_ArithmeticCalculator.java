package week3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the arithmetic operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result of addition: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result of subtraction: " + result);
        } else if (operator == '*') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("Error: Multiplication with zero will be zero.");
            } else {
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
            }
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result of division: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please enter +, -, *, or /.");
        }

        scanner.close();
    }
}