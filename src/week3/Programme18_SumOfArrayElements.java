package week3;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18_SumOfArrayElements {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] myArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        // Initialize a variable to store the sum
        int sum = 0;

        // Calculate the sum of array elements
//        for (int num : myArray) {
//            sum += num;
//        }
        for(int i=0; i<myArray.length; i++){
            sum += myArray[i];
        }

        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }

}
