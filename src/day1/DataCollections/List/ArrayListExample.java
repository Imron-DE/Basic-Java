package day1.DataCollections.List;

import java.util.ArrayList;


// ARRAY LIST = impelentasi dari interface list yang fungsinya untuk menyimpan data berbentuk array
// ArrayList = biasanya  dipakai untuk menyimpna data kompleks seperti objek
// kelebihan array list dibanding array biasa adalah kemudahan untuk memanipulasi data

public class ArrayListExample {
    public static void main(String[] args) {
        // array biasa
        int [] arraybiasa = new int[5];
        arraybiasa[0] = 10;
        arraybiasa[1] = 20;


        // arraylist
        ArrayList<String> daftarNama = new ArrayList<>();

        // cara menmbahkan data/element ke arraylist
        daftarNama.add("Danu");
        daftarNama.add("Dani");
        daftarNama.add("Deni");

        // cara menambahkan element di indeks tertentu
        daftarNama.add(2, "Dina");

        // cara akses element di indeks tertentu
        System.out.println("data" + daftarNama.get(0));

        // ubah element
        daftarNama.set(3, "Doni");

        // hapus element
        daftarNama.remove(2);

        // hitung element
        System.out.println("jumlah data : " + daftarNama.size());

        // cek apakah arraylist kosong
        System.out.println("apakah array list kosong " + daftarNama.isEmpty());

        // cek apakah element tertentu ada didalam arratlist
        System.out.println("nama 'Danu ada dalam daftar " + daftarNama.contains("Danu"));

        // ambil indeks element tertentu
        System.out.println("index danu " + daftarNama.indexOf("Danu"));

        // menampilkan semua element dalam arraylist
        System.out.println("daftar nama  " + daftarNama);

        // menampilkan semua data menggunakan looping
        for (String nama : daftarNama) {
            System.out.println(nama);
        }


        // membuat arraylist dengan tipe data yang bebeda
        ArrayList<Object> dataRandom = new ArrayList<>();
        dataRandom.add("Danu");
        dataRandom.add(20);
        dataRandom.add(true);
        dataRandom.add(3.5);

        // menampilkan data collection di terminal
        System.out.println(dataRandom);


        // buat nampilin data collection
        for (Object data : dataRandom) {
            System.out.println(data);
        }












    }
}
