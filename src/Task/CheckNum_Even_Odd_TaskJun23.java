package Task;

import java.util.Scanner;

public class CheckNum_Even_Odd_TaskJun23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a number: "); // Prompt the user for input
        //double number = input.nextDouble(); // Read the number entered by the user
        int num= input.nextInt();
        // Check if the number is Even,Odd
        if (num%2== 0) {
            System.out.println(num + " is a Even number.");
        } else{
            System.out.println(num + " is a Odd number.");
        }
    }
}
