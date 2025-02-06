package day2.Interface;

public class Main {
    public static void main(String[] args) {
        UserController akun1 = new UserController("imron","123");

        System.out.println("username : " + akun1.getUsername());
        System.out.println("username : " + akun1.getPassword());
        akun1.addUser("dimas ","12345");

        System.out.println("Total users " + akun1.getAllUser());
        // default method
        akun1.getCompany();

        // memanggil static method tanpa menggunakan class
        User.setName("Dimas Tri Sulaksono");

        // panggil method dari Role
        akun1.admin(true);

    }



}
