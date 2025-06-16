package ex_06_Ternary_Operator;
import java.util.Scanner;

public class GradeCalculation_Task12June2025 {

        public static void main(String[] args) {

            System.out.println("Enter marks:");
            Scanner scanner = new Scanner(System.in);

            int marks = scanner.nextInt();


//         marks>90 - A+
//        75<marks<90 -A
//       60<marks<75 - B
//        40<marks<60 - C
//        marks<40 -fail

            String result = marks >= 90 ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "fail";
            System.out.println(result);
            scanner.close();


        }

    }

