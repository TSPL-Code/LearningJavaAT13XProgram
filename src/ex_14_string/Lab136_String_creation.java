package ex_14_string;

public class Lab136_String_creation {
    public static void main(String[] args) {
        String s1 = "shruthi"; // SCP-> string constant pool
        String s2 = new String("shruthi"); // OA -> Object Area
        System.out.println(s1);
        System.out.println(s2);
    }
}
