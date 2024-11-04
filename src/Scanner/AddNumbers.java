// Reading the user input and printing it on the screen

package Scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String [] args) {
        // Creating an object of the Scanner class
        Scanner number = new Scanner(System.in);

        // Reading the integer input
        System.out.println("Enter any number: ");
        int num_a = number.nextInt();

        // Reading the integer input
        System.out.println("Enter another number: ");
        int num_b = number.nextInt();

        // Calculating the sum
        int sum = num_a + num_b;

        // Printing the sum
        System.out.println("The sum is: " + sum);
    }
}
