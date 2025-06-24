package Task;

import java.util.Scanner;

public class Grade_Task_June24 {
    public static void main(String[] args) {
        System.out.println();
//        ️⃣1. Take user input for marks (Use Scanner class).
//        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//        3️⃣ Use if-else-if conditions to determine the grade based on marks.
//        4️⃣ Display the grade as output.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter marks between 0 and 100:");
        int mark = sc1.nextInt();
    if (mark >= 90 && mark <= 100) {
        System.out.println("A+");
    } else if (mark >= 80 && mark < 90) {
        System.out.println("A");
    } else if (mark >= 70 && mark < 80) {
        System.out.println("B");
    } else if (mark >= 60 && mark < 70) {
        System.out.println("C");
    } else if (mark >= 50 && mark < 60) {
        System.out.println("D");

    }else if (mark >= 40 && mark < 50) {
        System.out.println("E");

    }else if (mark <=40) {
        System.out.println("FAIL");

    }
		else {
        System.out.println("Invalid mark entered. Please enter a mark between 0 and 100.");
        return; // Exit the program if the mark is invalid
    }
}
}