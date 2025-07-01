package Task_June27;
import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = input.nextInt();

        // Calculate years
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;

        // Calculate months (assuming 30 days per month)
        int months = remainingDaysAfterYears / 30;
        int remainingDaysAfterMonths = remainingDaysAfterYears % 30;

        // The remaining days are the final days
        int days = remainingDaysAfterMonths;

        System.out.println(totalDays + " days is approximately:");
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

    }
}
