package ex_06_Ternary_Operator;

import java.util.Scanner;

public class EvenOrOdd_Task12June2025 {
        public static void main(String[] args) {
            // Description: Uses ternary to check whether a number is
            //                 even or odd. A = 19,
            //                 update the a value and check again A =20;
            //int a 20;
            System.out.println("Enter numbers to check Even or Odd");
            Scanner scanner=new Scanner(System.in);
            //System.out.println("Enter numbers to check Even or Odd+" + a = scanner.nextInt());

           int a = scanner.nextInt();
            String result=(a%2==0)?"Even":"Odd";
            System.out.println(result);

        }
    }

