package day1.DataCollections.Map;

import java.util.HashMap;


/* hashmap : impelentasi dari interface map,untuk menyimpan data objek berbentuk key dan value
* Hashmap seperti reperesentasi data object diJavascrift */
public class HashMapExample {
    public static void main(String[] args) {
        // HashMap : impelentasi dari interface map yang fungsinya untuk menyimpan data berbentuk key-value
        HashMap<String, String> daftarNama = new HashMap<>();

        // menambahkan data ke hashMap
        daftarNama.put("nama", "danu");
        daftarNama.put("umur", "28");
        daftarNama.put("job", "trainer");

        // cara akses data didalam hashMap
        System.out.println("nama : " + daftarNama.get("nama"));
        System.out.println("nama : " + daftarNama.get("umur"));
        System.out.println("nama : " + daftarNama.get("job"));

        // cek ukuran data
        System.out.println("jumlah data : " + daftarNama.size());

        // cek hash map kosong
        System.out.println("hasmap kosong : " + daftarNama.isEmpty());

        // menampilkan semua key didalam hashmap pake entry set
        for (String key : daftarNama.keySet()) {
            System.out.println("key : " + key);

        }

        // menampilkan semua isi data didalam key hashmap
        for (String value : daftarNama.values()) {
            System.out.println("value : " + value);
        }

        // menampilka semua data di hashmap
        for (String key : daftarNama.keySet()) {
            System.out.println(key + " : " + daftarNama.get(key));
        }

        // cara merubah data di hashmap
        daftarNama.put("nama", "deni");

        // cara menghapus data berdasarkan key
        daftarNama.remove("umur");


    }
}
