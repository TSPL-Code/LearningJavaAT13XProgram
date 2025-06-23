package Task;

import java.util.Scanner;

public class SmallestofTwoNumbers_TaskJune23 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number1");
        int n1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter Number2");
        int n2=sc2.nextInt();
        int min=Math.min(n1,n2);
        System.out.println("The min of " + n1 + " and " + n2 + " is: " + min);
    }
}

