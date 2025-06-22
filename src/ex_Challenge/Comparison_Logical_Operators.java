package ex_Challenge;

public class Comparison_Logical_Operators {
    public static void main(String[] args) {
//**Requirements:**
//        - Use comparison operators (==, !=, <, >, <=, >=)
//        - Use logical operators (&&, ||, !)
//        - Print boolean results with explanatory messages
        // Declare and initialize variables
        int num1 = 10;
        int num2 = 5;
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("--- Comparison Operators ---");

        // Equal to (==)
        System.out.println("num1 == num2: " + (num1 == num2)); // false

        // Not equal to (!=)
        System.out.println("num1 != num2: " + (num1 != num2)); // true

        // Greater than (>)
        System.out.println("num1 > num2: " + (num1 > num2));   // true

        // Less than (<)
        System.out.println("num1 < num2: " + (num1 < num2));   // false

        // Greater than or equal to (>=)
        System.out.println("num1 >= num2: " + (num1 >= num2)); // true

        // Less than or equal to (<=)
        System.out.println("num1 <= num2: " + (num1 <= num2)); // false

        System.out.println("\n--- Logical Operators ---");

        // Logical AND (&&)
        // Returns true if both operands are true
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false
        System.out.println("condition1 && true: " + (condition1 && true));             // true

        // Logical OR (||)
        // Returns true if at least one operand is true
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true
        System.out.println("false || false: " + (false || false));                     // false

        // Logical NOT (!)
        // Inverts the boolean value of the operand
        System.out.println("!condition1: " + (!condition1)); // false
        System.out.println("!condition2: " + (!condition2)); // true
    }
}
