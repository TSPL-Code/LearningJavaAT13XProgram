package Task;

import java.util.Scanner;

public class LargestOfThree_TaskJune23 {
    public static void main(String[] args) {
        System.out.println("Enter Number1");
        Scanner sc1 = new Scanner(System.in);
        int n1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Number2");
        int n2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Number3");
        int n3 = sc3.nextInt();


        int largest;

        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }

        System.out.println("The smallest number is: " + largest);
    }
}
        //int max=Math.max(Math.max(n1,n2),n3);

