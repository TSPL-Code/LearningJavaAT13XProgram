package Task;

import java.util.Scanner;

public class TriangleChecker_Task_June24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3:");
        double side3 = scanner.nextDouble();

        // Check for non-positive side lengths
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Side lengths must be positive values.");
        }
        // Check the triangle inequality theorem
        else if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            System.out.println("The given side lengths can form a valid triangle.");
        }
        else {
            System.out.println("The given side lengths cannot form a valid triangle.");
        }

    }
}
