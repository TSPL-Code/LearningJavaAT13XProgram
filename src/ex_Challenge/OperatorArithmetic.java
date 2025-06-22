package ex_Challenge;

public class OperatorArithmetic {
    public static void main(String[] args) {

        // --- Arithmetic Operators ---
        System.out.println("--- Arithmetic Operators ---");
        int a = 10;
        int b = 3;

        int sum = a + b; // Addition
        System.out.println("a + b = " + sum);

        int difference = a - b; // Subtraction
        System.out.println("a - b = " + difference);

        int product = a * b; // Multiplication
        System.out.println("a * b = " + product);

        int quotient = a / b; // Division (integer division)
        System.out.println("a / b = " + quotient);

        int remainder = a % b; // Modulus (remainder)
        System.out.println("a % b = " + remainder);

        // Increment and Decrement operators
        int x = 5;
        x++; // Increment by 1 (x becomes 6)
        System.out.println("x++ = " + x);

        int y = 8;
        y--; // Decrement by 1 (y becomes 7)
        System.out.println("y-- = " + y);

        // --- Assignment Operators ---
        System.out.println("\n--- Assignment Operators ---");
        int c = 20;

        c += 5; // c = c + 5; (c becomes 25)
        System.out.println("c += 5: " + c);

        c -= 10; // c = c - 10; (c becomes 15)
        System.out.println("c -= 10: " + c);

        c *= 2; // c = c * 2; (c becomes 30)
        System.out.println("c *= 2: " + c);

        c /= 3; // c = c / 3; (c becomes 10)
        System.out.println("c /= 3: " + c);

        c %= 4; // c = c % 4; (c becomes 2)
        System.out.println("c %= 4: " + c);
    }
}

