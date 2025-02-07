package day3.Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> ListUser = new ArrayList<>();

    public void registerUser(User user){
        ListUser.add(user);
    }

    // Validasi apakah user sudah terdaftar
    public void isUserRegistered(User user){
        if(ListUser.contains(user)){
            System.out.println(user.getUsername() + " is registered");
        }else{
            System.out.println(user.getData() + "is not registered"); ;
        }
    }

    public static void main(String[] args) {
        Main userController = new Main(); // instansiasi dari objek Main

        // register user baru
        User user1 = new User("Danu","danu@gmail.com");
        User user2 = new User("Dani","dani@gmail.com");
        userController.registerUser(user1);
        userController.registerUser(user2);

        User userNotRegistered = new User("dimas","dimas@gmail.com");
        userController.isUserRegistered(userNotRegistered);
    }
}
