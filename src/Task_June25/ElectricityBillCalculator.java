package Task_June25;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input units from user
        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();

        if (units < 0) {
            System.out.println("Invalid input. Units must be a positive number.");
        } else {
            double bill = calculateBill(units);
            System.out.println("Electricity Bill for " + units + " units: ₹" + bill);
        }

        scanner.close();
    }

    public static double calculateBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = (100 * 0.50) + (units - 100) * 0.75;
        } else if (units <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        } else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) * 1.50;
        }

        return Math.round(bill * 100.0) / 100.0; // rounding to 2 decimal places
    }
}
