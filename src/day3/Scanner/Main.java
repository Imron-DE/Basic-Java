package day3.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // import Scanner dari java untuk membuat input ke terminal
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama =>");
        String nama = input.nextLine();
        System.out.println("Umur : =>");
        int age = input.nextInt();
        input.nextLine(); // membuat karatkter \n setelah membaca input khusus angka
        System.out.println("Kelas : =>");
        String kelas = input.nextLine();


        System.out.println("Halo, => " + nama + " umur " + age + " kelas " + kelas);

        // untuk menutup inputan
        input.close();
    }
}
