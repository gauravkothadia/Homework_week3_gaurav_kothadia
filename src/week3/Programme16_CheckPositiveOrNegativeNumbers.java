package week3;
import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_CheckPositiveOrNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is greater than 0
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        // Check if the number is less than 0
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        // Execute when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }
    }
}
