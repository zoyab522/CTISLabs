package sandbox;

// import tells th eprogram that we want to use this Java functionality
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // TODO code application logic here => this is where the code we write goes
        // We need to build (or instantiate) a new Scanner object
        // System.in => keyboard
        Scanner scan = new Scanner(System.in);

        //To generate random numbers, we need to instantiate a Random object
        Random rand = new Random();
        
        System.out.println(factorial(6));

    }

    // Recursion is based around methods--each time we use the method,
    // we ask it to calculate a smaller version of itself
    // For factorial, we will calculate the factorial of n using
    // n x the factorial of n - 1 with the base case n = 1
    // this is a public method that returns an integer and takes an integer as a parameter
    public static int factorial(int n) {
        System.out.println("The current value is " + n);
        // base case
        if (n <=1 ) {
            System.out.println("At the base case");
            return 1;
        }
        // let's get the current value of n * (n - 1)!
       int currentValue = n * factorial(n - 1);
       System.out.println("The current value is " + currentValue);
       return currentValue;
    }

    /**
     * // Declare an array that can hold four values // Need to know the type of
     * data it can hold double[] itemCost = new double[4]; // double [] is an
     * array that can hold double values // Assign values to each of the spaces
     * in the array itemCost[0] = 1.25; // [0] refers to the 0 index or the
     * first item in the array // So this line assigns 1.25 to this first index
     * in the itemCost array itemCost[1] = 3.75; itemCost[2] = 4.34; itemCost[3]
     * = 2.76; //itemCost[4] = 6.85; // This last line caused
     * an.ArrayIndexOutOfBoundsException because we tried to // write to an
     * index that was beyond what we had initialized--typically a logical error
     *
     * // Second approach to declaring and initializing and array double[]
     * itemCost2 = {1.25, 3.75, 4.34, 2.76}; // use { } to provide a list of
     * values
     *
     * // We can print out all the values in an array at once using
     * Arrays.toString System.out.println("itemCost: " +
     * Arrays.toString(itemCost)); System.out.println("itemCost2: " +
     * Arrays.toString(itemCost2));
     *
     * // Build a loop that calculates the average cost of the items in itemCost
     * // Initialize the index to its first value int index = 0; // Initialize
     * the sum of the values to 0 double sum = 0; // Start the while loop and
     * run it as long as index < itemCost.length while (index < itemCost.length)
     * { // add the value of the item at the index to the sum sum = sum +
     * itemCost[index]; index = index + 1;
     *
     * }
     * // calculate the average cost double averageCost = sum / itemCost.length;
     * System.out.println("The average cost is " + averageCost);
     **/
}


