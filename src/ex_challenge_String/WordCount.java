package ex_challenge_String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use regex to split by any non-word character(s) (including spaces, punctuation, tabs, newlines)
        // "\\W+" matches one or more non-word characters
        String[] words = input.trim().split("\\W+");

        int wordCount = 0;
        // If input is empty or contains only delimiters, words array might contain empty string
        if (words.length == 1 && words[0].isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = words.length;
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

