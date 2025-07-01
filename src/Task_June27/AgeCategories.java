package Task_June27;

import java.util.Scanner;

public class AgeCategories {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc1.nextInt();
        if(age<=12)
        {
            System.out.println("Child");
        }else if ((age>=13) && (age<=19))
        {
            System.out.println("Teenager");
        } else if ((age>=20) && (age<=64)) {
            System.out.println("Adult");
        } else if (age>=65)
        {
            System.out.println("Senior Citizen");
        }
    }

}
