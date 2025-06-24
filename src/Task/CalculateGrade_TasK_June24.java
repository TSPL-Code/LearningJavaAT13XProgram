package Task;

import java.util.Scanner;

public class CalculateGrade_TasK_June24 {
    public static void main(String[] args) {
        System.out.println();
//        ️⃣1. Take user input for marks (Use Scanner class).
//        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//        3️⃣ Use if-else-if conditions to determine the grade based on marks.
//        4️⃣ Display the grade as output.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter marks between 0 and 100:");
        int mark = sc1.nextInt();
        char grade;
        if (mark >= 90 && mark <= 100) {
            grade = 'A';
        } else if (mark >= 80 && mark < 90) {
            grade = 'B';
        } else if (mark >= 70 && mark < 80) {
            grade = 'C';
        } else if (mark >= 60 && mark < 70) {
            grade = 'D';
        } else if (mark >= 0 && mark < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid mark entered. Please enter a mark between 0 and 100.");
            return; // Exit the program if the mark is invalid
        }

        System.out.println("The student's grade is: " + grade);

    }
}