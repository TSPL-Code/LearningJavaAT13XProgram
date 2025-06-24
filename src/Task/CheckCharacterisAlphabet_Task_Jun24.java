package Task;
import java.util.Scanner;
public class CheckCharacterisAlphabet_Task_Jun24 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0); // Read the first character of the input

        // Check if the character is an uppercase or lowercase alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
    }

