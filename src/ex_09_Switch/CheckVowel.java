package ex_09_Switch;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        char ch=scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u') {
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+" is a consonant");
        }
    }
    }