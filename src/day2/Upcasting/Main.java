package day2.Upcasting;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user1 = admin; // upcasting admin ke user

        user1.login(); // panggil method dari superclass
        // user.1adminStatus(); // error karena tidak upcast

    }
}
