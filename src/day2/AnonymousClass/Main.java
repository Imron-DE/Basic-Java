package day2.AnonymousClass;

// Anonymous Class : class sementara yang mewarisi class parentnya
// ini cara singkat /sekali digunakan untuk membuat fungsi tambahan pada class yamg sudah ada
// dari pada bikin class baru yang terpisah

public class Main {
    public static void main(String[] args) {
        User user = new User("Danu",20);

        UserInterface userActions = new UserInterface() {
            @Override
            public void displayUser() {
                System.out.println("user name : " + user.getName();
                System.out.println("user age : " + user.getAge());
            }
            @Override
            public void UpdateUser() {
                System.out.println("User Update");
            }
        };
        userActions.displayUser();
        userActions.updateUser();
    }
}
