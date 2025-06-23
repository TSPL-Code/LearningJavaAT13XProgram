package ex_14_string;
import java.util.Scanner;
public class Task_Palindrome {
        public static void main(String[] args) {
            String str, rev = "";
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            str = sc.nextLine();

            int length = str.length();

            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + str.charAt(i);
           // String s1 = "madam";
           // String s2 = reverse(s1);
            if (str.equals(rev)) {
                System.out.println('"' + str + '"' + " is a palindrome.");
            } else{
                System.out.println('"' + str + '"' + " is not a palindrome.");
            }
        }
 }