package day2.Downcasting;
// superclass pparent class
public class User {
    void login (){
        System.out.println("Login succes!");
    }
}

// subclass
class Admin extends User {
    // void : method yang tidak memiliki return
    void adminStatus(){
        System.out.println("Hi, admin");
    }
}

// subclass
class Guest extends User{
    void guestStatus(){
        System.out.println("Hi, Guest");
    }
}