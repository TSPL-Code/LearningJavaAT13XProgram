package Task;
import java.util.Scanner;
public class LeapYearChecker_Task_June24 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year to check if it's a leap year: ");

        // Read the integer input (year) from the user
        int year = scanner.nextInt();

        // Check if the year is a leap year using the leap year rules

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}