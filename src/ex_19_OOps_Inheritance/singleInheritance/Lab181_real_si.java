package ex_19_OOps_Inheritance.singleInheritance;

import ex_18_Constuctors.CommonToAll;

public class Lab181_real_si {
    public static void main(String[] args) {
        Testcase1 t1 = new Testcase1();
        t1.runningTC1();

        Testcase2 t2 = new Testcase2();
        t2.runningTC2();

        CommonAll c1 = new CommonAll();
        Testcase1 t3 = new Testcase1();
        CommonAll c2 = new Testcase1(); // Dynamic Dispatch (extends)
//        TestCase1 t4 = new CommonToAll();

        // Webdriver driver = new ChromeDriver();

    }
}
