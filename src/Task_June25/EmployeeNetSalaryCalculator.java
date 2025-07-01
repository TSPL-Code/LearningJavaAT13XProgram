package Task_June25;
import java.util.Scanner;

public class EmployeeNetSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Basic Pay
        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        // Input HRA percentage
        System.out.print("Enter HRA (%): ");
        double hraPercent = scanner.nextDouble();

        // Input DA percentage
        System.out.print("Enter DA (%): ");
        double daPercent = scanner.nextDouble();

        // Input Tax Deduction
        System.out.print("Enter Tax Deduction amount: ");
        double taxDeduction = scanner.nextDouble();

        if (basicPay <= 0 || hraPercent < 0 || daPercent < 0 || taxDeduction < 0) {
            System.out.println("Invalid input. All values must be non-negative and basic pay must be positive.");
        } else {
            double netSalary = calculateNetSalary(basicPay, hraPercent, daPercent, taxDeduction);
            System.out.println("Net Salary: ₹" + netSalary);
        }

        scanner.close();
    }

    public static double calculateNetSalary(double basic, double hraPercent, double daPercent, double tax) {
        double hra = (hraPercent / 100) * basic;
        double da = (daPercent / 100) * basic;
        double grossSalary = basic + hra + da;
        double netSalary = grossSalary - tax;
        return Math.round(netSalary * 100.0) / 100.0; // Round to 2 decimal places
    }
}

