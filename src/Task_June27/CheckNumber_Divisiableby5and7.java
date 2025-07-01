package Task_June27;

import java.util.Scanner;

public class CheckNumber_Divisiableby5and7 {
    public static void main(String[] args) {
        System.out.println("Check Program to check Number 5 or 7");
        Scanner sc1=new Scanner(System.in);
        int i=sc1.nextInt();
       // for(int i=1;i<=10;i++)
       // {
            if((i%5==0) && (i%7==0))
            {
                System.out.println("number divisible by 5 and 7:"+ i);
            }
     //   }
        System.out.println("end");
    }

}
