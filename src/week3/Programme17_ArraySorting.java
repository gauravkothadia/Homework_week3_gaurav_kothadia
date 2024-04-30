package week3;
import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17_ArraySorting {
    
  public static void main(String[] args) {
        // Declare and initialize a numeric array
        int[] numericArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
            
        // Print the original numeric array
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        
        // Sort the numeric array in ascending order
        Arrays.sort(numericArray);

        // Print the sorted numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

      // Declare and initialize a string array
        String[] stringArray = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

      // Print the original string array
        System.out.println("Original string array: " + Arrays.toString(stringArray));

        // Sort the string array in lexicographical (alphabetical) order
        Arrays.sort(stringArray);

        // Print the sorted string array
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    
  }
}
