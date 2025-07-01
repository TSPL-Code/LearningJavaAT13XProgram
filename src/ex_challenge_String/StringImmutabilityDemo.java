package ex_challenge_String;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String original = "  Hello World  ";

        System.out.println("Original String: '" + original + "'");

        // Using toUpperCase() without assignment
        original.toUpperCase();
        System.out.println("After toUpperCase() without assignment: '" + original + "'");

        // Using trim() without assignment
        original.trim();
        System.out.println("After trim() without assignment: '" + original + "'");

        // Now assigning the results to new variables
        String upper = original.toUpperCase();
        String trimmed = original.trim();

        System.out.println("After toUpperCase() with assignment: '" + upper + "'");
        System.out.println("After trim() with assignment: '" + trimmed + "'");

        // Original string remains unchanged
        System.out.println("Original String after assignments: '" + original + "'");
    }
}
