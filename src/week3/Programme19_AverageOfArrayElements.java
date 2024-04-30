package week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AverageOfArrayElements {
    public static void main(String[] args) {
        double[] numArray = new double[6];
        System.out.println("Enter 6 different numbers of your choice.");
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<numArray.length; i++){
            numArray[i]= scanner.nextDouble();
        }
        double sum = 0.0;

//        for (double num : numArray) {
//            sum += num;
//        }

        for(int i=0; i<numArray.length; i++){
            sum = sum+numArray[i];
        }

        double average = sum / numArray.length;
        System.out.println("Your array of 6 number is: "+ Arrays.toString(numArray));
        System.out.format("The average is: %.2f", average);
    }

}
