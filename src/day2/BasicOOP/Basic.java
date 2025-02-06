package day2.BasicOOP;
///  Basic OOP
/// Class konsep dasaruntuk membuat objek atau kerangka kerja yang mendefinisikan
/// karakteristik dan perilaku suatu objek
/// atau bisa di bilang class yang berisi fungsionalitas suatu program
public class Basic { // class penampung
public static class Human{ // class static yang bisa dipanggil oleh class laainnnya
    // class atribut : data yang dimili objek
    String name;
    int age ;
    // contructor : method khusus yang menginisialisasikan objek / nilai awal dair variable class
    public Human(String name,int age ){
        this.name=name;
        this.age=age;
    }
    // method : fungsi khusus yang dimiliki objek
    public void breath (){
        System.out.println(name + "is breating . and he's " + age + " years old");
    }
    public void fart (){
        System.out.println(name + "isfarting!");
    }
}
}

