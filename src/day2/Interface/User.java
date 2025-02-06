package day2.Interface;

/* Interface : Kumpulan method yang harus digunakan oleh class yang meng implementasikannya */
public interface User {
    // Method biasa yang wajib di gunakan oleh class yang mengimplementasikannya
    String getUsername();
    String getPassword();

    void addUser(String username, String password);
    int getAllUser();


    // Default method = method ini tidak perlu di override (opsional)
    default void getCompany(){
        System.out.println("Company : PT. Aigen Global Teknologi");

    }
    // static method = method yang bisa dipanggil langsung tanpa memerlukan class (method ini tidak bisa di override )
    static void setName(String name){
        System.out.println("nama: "+ name);
    }
}
