package day1.Method;

// cara import methode instance
import static  day1.Method.MultipleMethod.*;
import static day1.Method.Animal.*;

public class Method {
        // Methode : fungsi untuk menjalankan suatu perintah/ perilaku tertentu (Fungsi)

        /* public static int add (int,num1,int num 2) {} cara membuat methode
          publiic static :accesa modifier agar methode ini bisa digunakan secara global
          int add (params) methode/ fungsi dengan return integer
          return : untuk mengembalikan nilai*/


        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        public static int cekNilai(int nilai){
            if (nilai >= 80){
                System.out.println("Lulus");
            } else {
                System.out.println("tidak lulus");
            }
            return nilai;
        }


        public static void main (String[] args){
             // cara jalanin method
             int result = add (5,2);
            System.out.println("sum : " + result);

            // panggil methode
            cekNilai(90);

            // multiple
            System.out.println("== methode overload ==");
            System.out.println("multiple method : " + multiple(2,10) );
            System.out.println("multiple double method : " + multiple(2.5,10.5) );
            System.out.println();

            System.out.println("== Methode override ==");
            System.out.println(sound()); // parent yang return asli
            System.out.println(Cat.sound()); // child yang mereplace methode parent

            // cara memaanggil instance meyhod : simpan class nya sebagai object baru
            System.out.println("== instance method ==");
            Animal hewan = new Animal();
            System.out.println(hewan.sound());

            Cat kocheng = new Cat();
            System.out.println(kocheng.sound());
        }

    }

