package week3;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme06_OddOrEvenNumbers {
    public String oddEven(int num){
        String numberStatus;
        if(num%2==0){
            numberStatus = "Even";
        } else{
            numberStatus = "Odd";
        }
        return numberStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        Programme06_OddOrEvenNumbers obj = new Programme06_OddOrEvenNumbers();
        System.out.println(number+" entered is "+obj.oddEven(number));
    }
}