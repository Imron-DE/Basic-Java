package day2.BasicOOP.AccessModifier;

public class Main {

    public static void main(String[] args) {
        // panggil class dalam objek baru
        Person person1 = new Person("dimas",30,"Depok");
        Person person2 = new Person("maruf",30,"Jakut");
        Person person3 = new Person("alwi",30,"Tangsel");

        // panggil methode nya
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person.displayTotalPerson();

        // AKSES data nya
        System.out.println("Public access : "+ person1.name);
        // System.out.println("Private access : "+ person1.age); // error karena accessnya private
        System.out.println("protected access : "+ person1.address);
        System.out.println("final access : "+ person1.NATIONALITY);

        // Kapan harus implentasi access modifier ?
        // public : biasanya sipakai untuk class atau method yang biasanya bisa dipnaggil dimana saja
        // private : biasanya digunakan untuk mendeklarasikan variable class dimana tidak sembarangan bisa diubah
        // final : ketika kita mau mendefinisikaan nilai default yang konstant yntyk siatu variable
    }
}
