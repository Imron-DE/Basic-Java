package day1.Basic;

/* JAVA :bahasa programming OOP {Object Oriented Programming} */
// setiap class yang dimuat file java akan mewakili suatu object

public class Basic {
    // Methode MAIN : block code yang akan mengeksekusi suatu perintah
    public static void main(String[] args) {
        // variable : buat wadah penyimpanan data
        // tipe data : jenis data yang digunakan dalam variable
        /* cara buat variable :
        <tipe data> <nama variable> = isi data
         */
        String name = "Danu"; // string

        int age = 28; // integer

        Boolean isStudent = false; // boolean

        // system.out.println() : buat menampilkan outpu ke terminal
        System.out.println("nama aku "  + name + age + " umur ku" + "dan status siswaku " + isStudent);

        // south adalah shortcut untuk menampilkan println
        // array padda java memiliki ukuran data statis ,tidak bisa sembarangan diubah (ditambahkan) dan cuma menyimpan 1 tipe data
        System.out.println("== ARRAY ==");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Lenght : " + numbers.length);
        numbers[4] = 7;
        // looping tradisional
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("array ke -  " + i);
        }

        // Integer : tipe data yang dimanipulasi menggunakan methode-methode array
        Integer integerNumber = 12;
        System.out.println("Integer : " + integerNumber);


        // object : tipe data campuran
        Object[] dataCampuran = {"Danu", 28};
        System.out.println(dataCampuran);
        // enchanged looping
        for (Object i : dataCampuran) {
            System.out.println("dataCampuran : "+i);
        }

        // tipe data yang ukuran/kapasitasnya lebih besar dibanding int
        long longNumber = 123;
        System.out.println(longNumber);
        // tipe data untuk nilai pecahan
        double doubleNumber = 10.2;
        float floatNumber = 10;

        // concatnation : method untuk menggabungkan 2 string
        String firstName = "Danu";
        String lastName = "Dina";
        System.out.println("basic : " + firstName + " " + lastName);
        System.out.println("concat : " + firstName.concat(" " + lastName));


        // ENUM : buat menyimpan nilai -nilai konstan yang tidak bisa di ubah
        enum Grade{
            LULUS,
            TIDAK_LULUS
        }
        System.out.println("Status kelulusan : " + Grade.LULUS);
    }
}
