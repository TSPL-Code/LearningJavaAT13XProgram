package ex_Challenge;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int a = 10;
        int b;

        // Pre-increment: increments 'a' first, then uses the new value in the assignment to 'b'
        System.out.println("--- Pre-increment (++) ---");
        System.out.println("Initial value of a: " + a); // a = 10
        b = ++a;
        System.out.println("Value of a after ++a: " + a); // a = 11
        System.out.println("Value of b after b = ++a: " + b); // b = 11
        System.out.println();

        // Post-increment: uses the current value of 'a' in the assignment to 'b', then increments 'a'
        a = 10; // Reset 'a' for demonstration
        System.out.println("--- Post-increment (++) ---");
        System.out.println("Initial value of a: " + a); // a = 10
        b = a++;
        System.out.println("Value of b after b = a++: " + b); // b = 10
        System.out.println("Value of a after a++: " + a); // a = 11
        System.out.println();

        // Pre-decrement: decrements 'a' first, then uses the new value in the assignment to 'b'
        a = 10; // Reset 'a' for demonstration
        System.out.println("--- Pre-decrement (--) ---");
        System.out.println("Initial value of a: " + a); // a = 10
        b = --a;
        System.out.println("Value of a after --a: " + a); // a = 9
        System.out.println("Value of b after b = --a: " + b); // b = 9
        System.out.println();

        // Post-decrement: uses the current value of 'a' in the assignment to 'b', then decrements 'a'
        a = 10; // Reset 'a' for demonstration
        System.out.println("--- Post-decrement (--) ---");
        System.out.println("Initial value of a: " + a); // a = 10
        b = a--;
        System.out.println("Value of b after b = a--: " + b); // b = 10
        System.out.println("Value of a after a--: " + a); // a = 9
    }
}
