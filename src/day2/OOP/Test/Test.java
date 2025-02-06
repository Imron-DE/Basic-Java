package day2.OOP.Test;

import java.util.ArrayList;
import java.util.List;

/*1. Buat Object Student dengan atibut nama,NIM dan Nilai
* lalu simpan data Student tersebut kedalam ArrayList
* kemudian buat methode berikut :
* 1.  menghitung rata-rata nilai student
* 2. cari nilai tertinggi
* 3.dan tampilkan data student dengan nilai rata-rata */
public class Test {
    public static void main(String[] args) {
        List<Student> daftarMahasiswa = new ArrayList<>();

        daftarMahasiswa.add(new Student("Danu", 12345, 85));
        daftarMahasiswa.add(new Student("Dana", 67890, 90));
        daftarMahasiswa.add(new Student("Dano", 11223, 75));
        daftarMahasiswa.add(new Student("Dunu", 12348, 80));
        daftarMahasiswa.add(new Student("Dona", 67898, 95));
        daftarMahasiswa.add(new Student("Dino", 11226, 70));


        for (Student mahasiswa : daftarMahasiswa) {
            mahasiswa.displayStudent();

        }

        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        Student mahasiswaNilaiTertinggi = null;

        for (Student mahasiswa : daftarMahasiswa) {
            int nilai = mahasiswa.getNilai();
            totalNilai += nilai;


            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
                mahasiswaNilaiTertinggi = mahasiswa;
            }
        }

        double avg = (double) totalNilai / daftarMahasiswa.size();
        System.out.println("Rata-rata nilai mahasiswa: " + avg);


        if (mahasiswaNilaiTertinggi != null) {
            System.out.println("Mahasiswa dengan nilai tertinggi:");
            mahasiswaNilaiTertinggi.displayStudent();
        }
    }
}
