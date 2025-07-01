package ex_challenge_String;

import java.util.Scanner;

public class RemoveWhitespace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Remove all whitespace characters (space, tab, newline, etc.)
        String result = input.replaceAll("\\s+", "");

        System.out.println("String after removing all whitespaces: ");
        System.out.println(result);

        scanner.close();
    }
}

