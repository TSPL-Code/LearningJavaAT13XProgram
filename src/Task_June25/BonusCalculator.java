package Task_June25;
import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Input years of experience
        System.out.print("Enter Years of Experience: ");
        double yearsOfExperience = scanner.nextDouble();

        if (salary <= 0 || yearsOfExperience < 0) {
            System.out.println("Invalid input. Salary must be positive and experience cannot be negative.");
        } else {
            double bonus = calculateBonus(salary, yearsOfExperience);
            System.out.println("Bonus Amount: ₹" + bonus);
        }

        scanner.close();
    }

    public static double calculateBonus(double salary, double yearsOfExperience) {
        double bonus = 0;

        if (yearsOfExperience >= 1 && yearsOfExperience <= 3) {
            bonus = salary * 0.05;
        } else if (yearsOfExperience >= 4 && yearsOfExperience <= 6) {
            bonus = salary * 0.10;
        } else if (yearsOfExperience > 6) {
            bonus = salary * 0.15;
        }

        return Math.round(bonus * 100.0) / 100.0; // Round to 2 decimal places
    }
}
