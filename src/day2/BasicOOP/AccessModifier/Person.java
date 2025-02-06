package day2.BasicOOP.AccessModifier;

public class Person {
    // Access Modifier: Mengatur aksesibilitas variabel, metode, dan kelas

    // Public: Bisa diakses dari mana saja
    public String name;

    // Private: Hanya bisa diakses di dalam kelas Person
    private int age;

    // Protected: Bisa diakses di dalam kelas Person dan subclass-nya
    protected String address;

    // Non-Access Modifier
    // Static: Variabel yang berlaku untuk seluruh instance dari kelas
    public static int totalPerson = 0;

    // Final: Konstanta yang nilainya tidak bisa diubah
    public final String NATIONALITY = "Indonesian";

    // Constructor yang benar
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        totalPerson++; // Menambah jumlah objek yang dibuat
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("My name : " + name);
        System.out.println("My age : " + age);
        System.out.println("My address : " + address);
    }

    // Method static untuk menampilkan total objek yang telah dibuat
    public static void displayTotalPerson() {
        System.out.println("Total person : " + totalPerson);
    }
}
