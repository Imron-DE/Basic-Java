package day3.Scanner;

import java.util.Scanner;

public class Siswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        input.nextLine();

        String[] namaSiswa = new String[jumlahSiswa];
        int[] umurSiswa = new int[jumlahSiswa];
        String[] kelas = new String[jumlahSiswa];
        double[] nilai = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nData siswa ke-" + (i + 1));
            System.out.print("Nama   => ");
            namaSiswa[i] = input.nextLine();
            System.out.print("Usia   => ");
            umurSiswa[i] = input.nextInt();
            input.nextLine();
            System.out.print("Kelas  => ");
            kelas[i] = input.nextLine();
            System.out.print("Nilai  => ");
            nilai[i] = input.nextDouble();
            input.nextLine();

            System.out.println("Nama siswa: " + namaSiswa[i]);
        }

        // Menghitung rata-rata nilai
        double total = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            total += nilai[i];
        }
        double rataRata = total / jumlahSiswa;
        System.out.println("\nRata-rata nilai = " + rataRata);

        // Menutup scanner
        input.close();
    }
}
