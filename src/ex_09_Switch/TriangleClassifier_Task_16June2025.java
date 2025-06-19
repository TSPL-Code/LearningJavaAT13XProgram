package ex_09_Switch;
import java.util.Scanner;

public class TriangleClassifier_Task_16June2025 {
    public static void main(String[] args) {
        //Take 3 sides as  input from user
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int c;
        System.out.println("Enter the length of 3 sides of triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a==b&&b==c){
            System.out.println("The Triangle is Equilateral Triangle");
        }
        else if(a==b || b==c ||a==c){
            System.out.println("The Triangle is isosceles Triangle");
        }else{
            System.out.println("The Triangle is scalene triangle");
        }

    }
}
