package ex_19_OOps_Inheritance.Multilevel.MultilevelLoginSystem_TaskJuly2;

public class main {
    public static void main(String[] args) {
        SuperAdmin superadm=new SuperAdmin();
        superadm.login();
        superadm.accessAdminPanel();
        superadm.shutdownSystem();
    }

}
