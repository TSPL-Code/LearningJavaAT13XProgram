package Task_June25;

import java.util.Scanner;

public class PolindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        scanner.close();

        int num = originalNumber; // Create a copy to manipulate
        int reversedNumber = 0;
        int remainder;
        // Reverse the number
        while (num != 0) {
            remainder = num % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + remainder; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        // Check if the original and reversed numbers are equal
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

    }
}
