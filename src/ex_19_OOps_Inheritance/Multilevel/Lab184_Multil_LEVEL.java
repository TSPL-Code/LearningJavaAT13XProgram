package ex_19_OOps_Inheritance.Multilevel;

public class Lab184_Multil_LEVEL {
    public static void main(String[] args) {


        // Son s1 = new Father();
        //  Son s1 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
    }
