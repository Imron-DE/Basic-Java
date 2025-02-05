package day1.Method;


//methode override : methode yang bisa di overwrite
// class parent
public class Animal {
    public static String sound() {return "kiw kiw";};

}

// class children yang mewarisi sifat/metode dari parent
class Cat extends Animal {
    public static String sound() {return "miaw miaw";}
}