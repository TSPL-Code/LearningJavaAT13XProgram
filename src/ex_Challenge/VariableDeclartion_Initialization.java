package ex_Challenge;
//**Requirements:**
//- Declare and initialize variables of different primitive data types (int, double, boolean, char)
//- Print the values of all variables
//- Show proper naming conventions
public class VariableDeclartion_Initialization {
    public static void main(String[] args)
    {
        // 1. Integer Data Types
        byte myByte = 10;                // 8-bit signed integer
        short myShort = 1000;            // 16-bit signed integer
        int myInt = 50000;               // 32-bit signed integer
        long myLong = 10000000000L;      // 64-bit signed integer (note the 'L' suffix)

        // 2. Floating-Point Data Types
        float myFloat = 3.14f;           // 32-bit floating-point (note the 'f' suffix)
        double myDouble = 123.456789;    // 64-bit floating-point

        // 3. Character Data Type
        char myChar = 'A';               // 16-bit Unicode character

        // 4. Boolean Data Type
        boolean myBoolean = true;        // Stores true or false

        // 5. String (Reference Type)
        String myString = "Hello, Java!"; // Represents a sequence of characters

        // Print the declared and initialized variables
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        // Demonstrating re-initialization (assigning a new value)
        myInt = 75000;
        myBoolean = false;
        myString = "Updated String!";

        System.out.println("\nAfter Re-initialization:");
        System.out.println("Updated Int: " + myInt);
        System.out.println("Updated Boolean: " + myBoolean);
        System.out.println("Updated String: " + myString);
    }
    }