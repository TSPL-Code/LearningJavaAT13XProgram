package Task_June25;

import java.util.Scanner;

public class TravelEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Age
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume leftover newline

        // Input Visa Status
        System.out.print("Enter Visa Status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();

        // Validate and Check Eligibility
        if (age < 0) {
            System.out.println("Invalid age. Age must be a non-negative integer.");
        } else if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status. Please enter 'valid' or 'invalid'.");
        } else {
            if (age >= 18 && visaStatus.equals("valid")) {
                System.out.println("✅ Person is eligible to travel.");
            } else {
                System.out.println("❌ Person is NOT eligible to travel.");
            }
        }

        scanner.close();
    }
}

