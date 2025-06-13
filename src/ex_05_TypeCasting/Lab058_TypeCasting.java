package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        System.out.println("Implicit Casting a value>>" + a);
        int a1 = (int)b; // Widening -> Explicit Casting

        System.out.println("after Explicit Casting a value>>" + a1);

    }
}
