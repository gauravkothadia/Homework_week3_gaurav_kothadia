package week3;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme01_OddOrEvenNumbers {
    public String oddEven(int num){
        String numberStatus = (num%2==0)?"even":"odd";
        return numberStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        Programme01_OddOrEvenNumbers obj = new Programme01_OddOrEvenNumbers();
        System.out.println(number+" entered is "+obj.oddEven(number));
    }
}
