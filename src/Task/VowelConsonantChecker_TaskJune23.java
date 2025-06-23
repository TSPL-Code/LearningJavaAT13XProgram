package Task;
import java.util.Scanner;
public class VowelConsonantChecker_TaskJune23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch); // Convert to lowercase for easier comparison

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Input is not a valid alphabet.");
        }
    }
}
