package day2.OOP.Users;

// INHARITANCE
// Konsep untuk menurunkan sifat/ perillaku parent claass ke chilld class
// artinya cllass turunanya bisa menggunakan properti dan method milik parent
// child class(inharitance) ditandai dengan kata kunci  extends
public class User {
    private String Username;

    public User(String Uname) {Username = Uname;}
    public String getUsername() {return Username;}
    public void displayInfo() {
        System.out.println("Username : " + Username);
    }
}
