package week3;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_InputTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isDigit(inputChar)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }
}