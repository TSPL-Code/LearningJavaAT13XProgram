package Task;

import java.util.Scanner;

public class LargestOfThree_TaskJune23 {
    public static void main(String[] args) {
        System.out.println("Enter Number1");
        Scanner sc1=new Scanner(System.in);
        int n1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter Number2");
        int n2=sc2.nextInt();
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter Number3");
        int n3=sc3.nextInt();

        int max=Math.max(Math.max(n1,n2),n3);
        System.out.println("The largest number is: " + max);

    }
}
