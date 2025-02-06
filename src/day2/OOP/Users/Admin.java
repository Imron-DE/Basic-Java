package day2.OOP.Users;

// ini  adalah child class implementasi dari inharitance
// child class Admin inhirit from parent class User
public class Admin extends User{
    private boolean isAdmin;

    public  Admin(String username,boolean role){
        super(username); // panggil variable milik class parent(user)
        isAdmin = role;
    }

    // overwrite metode parent
    @Override
    public void displayInfo(){
        System.out.println("Admin username : " + getUsername());
        System.out.println("Is admin : " + isAdmin);
    }
}
