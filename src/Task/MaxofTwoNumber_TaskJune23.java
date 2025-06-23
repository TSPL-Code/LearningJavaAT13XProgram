package Task;
import java.util.Scanner;
import java.lang.Math;

public class MaxofTwoNumber_TaskJune23 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number1");
        int n1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter Number2");
        int n2=sc2.nextInt();

        int maximum;
        if (n1 > n2) {
            maximum = n1;
        } else {
            maximum = n2;
        }
        System.out.println("The maximum of " + n1 + " and " + n2 + " is: " + maximum);
    }
    }

