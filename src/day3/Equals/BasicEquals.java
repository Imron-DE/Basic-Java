package day3.Equals;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

/* EQUALS : method untuk membadingka 2 objek apakah mereka mempunyai atribut dan isi yang sama
* ini sama kaya operator == di JS */

public class BasicEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai Ionic 5", 2023);
        Car car2 = new Car("Toyota Supra X ", 2025);
        Car car3 = car1; // mereferensikan (akses alamat) objek ke objek yang sudah ada

        // methode equals default dari object
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);
        System.out.println(car1 == car3);

        if (car1.equals(car3)){
            System.out.println("Mobilnya sama");
        } else {
            System.out.println("Mobilnya beda");
        }
        boolean status = car1 == car2;
        System.out.println(status);

    }
}
