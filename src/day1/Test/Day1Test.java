package day1.Test;

public class Day1Test {
    public static void main(String[] args) {
        /* 1. Buat logic untuk ngecek apakah sebuah  bilangan adalah bilangan prima  */
        // inisialisasi modul
        int numbers = 3, checker = 0;
        System.out.println("== NO.1 ==");
        for (int i = 2; i <= numbers; i++) {
            if (numbers % i == 0) {
                checker++;
            }
        }
        if (checker == 1) {
            System.out.println(numbers + " adalah bilangan prima");
        } else {
            System.out.println(numbers + " bukan nilangan prima");
        }

        /* Buat logic untuk mencari nilai terbesar dan terkecil dari sebuah array pake math Method */


        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = angka[0];
        int max = angka[0];

        for (int num : angka) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println("== NO.2 ==");
        System.out.println("Nilai Terendah: " + min);
        System.out.println("Nilai Tertinggi: " + max);

        /* 3. Buat logic untuk mencari jumlah element yang nilainya genap dan jumlah element yang nilainya ganjil dari
        array angka
         */

        int genap = 0;
        int ganjil = 0;

        for (int i : angka
        ) {
            if (i % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }

        System.out.println("== SOAL NO.3 ==");
        System.out.println("Jumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);

        // 4.Buat logic untuk mnghitung jumlah karakter dalam sebuah string
        String kata = "aku sedang belajar java ";

        System.out.println("== NO.4 ==");
        System.out.println("Jumlah karakter = " + kata.length());


        // 5. Buat logic untuk menghitung jumlah huruf vocal dalam string 'kata'

        int hurufVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            char ch = kata.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hurufVokal++;
            }
        }

        System.out.println("== SOAL NO.5==");
        System.out.println("Jumlah huruf vokal: " + hurufVokal);



         /* 6. Buat array yang terdiri dari 5 mahasiswa, masing masing punya 3 nilai : ujian, absens dan kuis
        kalkulasi nilai mereka berdasarkan rata rata nilai dari 3 nilai tersebut
        lalu tentukan Grade mereka berdasarkan nilai  rata-rata menggunakan logic if-else-enum
         */
        int[][] mahasiswa = {
                {10, 10, 9},
                {6, 9, 9},
                {9, 2, 9},
                {9, 3, 9},
                {8, 9, 8}
        };
        enum GRADE {
            A, B, C, D, E, F
        }
        ;

        for (int i = 0; i < mahasiswa.length; i++) {
            int total = 0;
            for (int nilai : mahasiswa[i]) {
                total += nilai;
            }
            double rataRata = (double) total / mahasiswa[i].length;

            GRADE grade;
            if (rataRata >= 9) {
                grade = GRADE.A;
            } else if (rataRata >= 8) {
                grade = GRADE.B;
            } else if (rataRata >= 7) {
                grade = GRADE.C;
            } else if (rataRata >= 6) {
                grade = GRADE.D;
            } else if (rataRata >= 5) {
                grade = GRADE.E;
            } else {
                grade = GRADE.F;
            }
            System.out.println("== SOAL NO.6 ==");
            System.out.println("Mahasiswa " + (i + 1) + " - Rata-rata: " + rataRata + " - Grade: " + grade);


        }
    }
}





























