package Task_June25;

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Age
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        // Input Salary
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Input Credit Score
        System.out.print("Enter Credit Score: ");
        int creditScore = scanner.nextInt();

        // Check eligibility
        String result = checkLoanEligibility(age, salary, creditScore);
        System.out.println("\nResult: " + result);

        scanner.close();
    }

    public static String checkLoanEligibility(int age, double salary, int creditScore) {
        // Age Validation
        if (age <= 0) {
            return "Invalid Age: Age must be a positive integer.";
        }
        if (age < 18) {
            return "Not Eligible: Minimum age must be 18.";
        }
        if (age > 80) {
            return "Not Eligible: Maximum age allowed is 80.";
        }

        // Salary Validation
        if (salary <= 0) {
            return "Invalid Salary: Salary must be a positive number.";
        }
        if (salary < 30000) {
            return "Not Eligible: Minimum salary must be ₹30,000.";
        }

        // Credit Score Validation
        if (creditScore <= 0) {
            return "Invalid Credit Score: Must be a positive integer.";
        }
        if (creditScore < 650) {
            return "Not Eligible: Credit score too low. Minimum is 650.";
        }
        if (creditScore > 850) {
            return "Invalid Credit Score: Maximum possible is 850.";
        }

        return "Eligible for Loan ✅";
    }
}
