package Task;

import java.util.Scanner;

public class CheckNumPositiveNegative_TaskJune23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a number: "); // Prompt the user for input
        double number = input.nextDouble(); // Read the number entered by the user

        // Check if the number is positive, negative, or zero using if-else if-else
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}