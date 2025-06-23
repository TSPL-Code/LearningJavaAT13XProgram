package Task;

import java.util.Scanner;

public class CheckAgeEligibletoVote_TaskJune23 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc1.nextInt();
        if (age>18){
            System.out.println("Eligible to Vote");
        }else {
            System.out.println("Not Eligible to Vote");
        }
    }
}
