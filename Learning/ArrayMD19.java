/*
import java.util.Arrays;

public class ArrayMD19 {

    public static void main(String[] args) {
        /* int nums[][] = new int[3][4];
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n \3n \4n \5n \6n \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n \3n \4n \5n \6n \n");
        for (int n[] : nums) {
            System.out.print(Arrays.toString(n) + " "); // Will print 1D array
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println("\n");
            System.out.print("\n");
        }
 
        int arr[][][] = new int[3][4][2];

        for (int n[][] : arr) {
            System.out.println("\nPrinting n[][]: " + Arrays.deepToString(n));
            for (int m[] : n) {
                System.out.println("\nPrinting m[]: " + Arrays.toString(m));
                for (int o : m) {
                    o = (int) (Math.random() * 10);
                    System.out.print("\nPrinting o : " + o + " ");
                }
            }
        }

        System.out.println("\nPrinting arr[][][]: " + Arrays.deepToString(arr));

    }
}
 */

import java.util.Arrays;

public class ArrayMD19 {

    public static void main(String[] args) {
        // Declare and initialize the 3D array
        int arr[][][] = new int[3][4][2];

        // Fill the 3D array with random integers using nested for-each loops
        for (int[][] n : arr) {  // Iterate over the 2D arrays
            for (int[] m : n) {  // Iterate over the 1D arrays within the 2D arrays
                for (int i = 0; i < m.length; i++) {  // Iterate over the elements of the 1D array
                    m[i] = (int) (Math.random() * 10);  // Assign a random integer between 0 and 9
                }
            }
        }

        // Print the 3D array using nested for-each loops
        System.out.println("\nPrinting arr[][][]: " + Arrays.deepToString(arr));
        for (int[][] n : arr) {  // Iterate over the 2D arrays
            System.out.println("\nPrinting n[][]: " + Arrays.deepToString(n));
            for (int[] m : n) {  // Iterate over the 1D arrays within the 2D arrays
                System.out.println("\nPrinting m[]: " + Arrays.toString(m));
                for (int o : m) {  // Iterate over the elements of the 1D array
                    System.out.print("Printing o : " + o + " ");
                }
                System.out.println();  // Add a newline for better formatting
            }
            System.out.println();  // Add a newline for better formatting
        }
    }
}
