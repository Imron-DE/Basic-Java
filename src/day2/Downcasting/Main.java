package day2.Downcasting;

// downcasting adalah melakukan perubahan superclass/parent menjadi subclass/child class
// agar bisa menggunakan method / attribut yang sfsifik dari subclass
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(); // membuat objek admin
        Guest guest = new Guest();
        User user1 = admin; // membuat objek uuser
        User user2 = guest;

        Admin admin1 = (Admin) user1; // downcasting user ke admin
        admin1.adminStatus(); // method yang ingin digunakan superclass
        admin1.login(); // method yang masih bida digunakan superclass walaupun sudah di downcast

        Guest guest1 = (Guest) user2;
        guest1.guestStatus();
    }
}
