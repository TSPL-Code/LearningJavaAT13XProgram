package Task_June25;

import java.util.Scanner;

public class Armstrong {
    //An Armstrong number is a number that is equal to the sum of its own digits,
    // each raised to the power of the number of digits.
    //Input: n = 153
    //Output: true
    //Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
    //
    //Input: n = 9474
    //Output: true
    //Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
    //
    //Input: n = 123
    //Output: false
    //Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfPowers = 0;
        int numberOfDigits = 0;

        // Calculate the number of digits
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of powers of digits
        tempNumber = originalNumber; // Reset tempNumber to the original value
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfPowers += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }

        // Check if it's an Armstrong number using if-else
        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
