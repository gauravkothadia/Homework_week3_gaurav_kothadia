package week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class Programme20_ArrayContains {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Given array: "+ Arrays.toString(num));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of your choice: ");
        int toFind = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == toFind) {
                found = true;
                break;
            }
        }
//        for (int n : num) {
//            if (n == toFind) {
//                found = true;
//                break;
//            }
//        }

        if (found) {
            System.out.println(toFind + " is found in the given array.");
        } else {
            System.out.println(toFind + " is not found in the given array.");
        }
        scanner.close();
    }
}
