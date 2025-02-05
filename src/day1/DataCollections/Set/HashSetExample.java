package day1.DataCollections.Set;


import java.util.HashSet;

/* Hahset : implementasi dari interface set untuk menyimpan data-data yang unik (tidak boleh duplikat
* dalam bentuk himpunan atau set */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String > HimpunanNama = new HashSet<>();

        HimpunanNama.add("Danu");
        HimpunanNama.add("Dani");
        HimpunanNama.add("Danu");
         // tidak bisa ditambahkan lagi karena sudah ada


        System.out.println("set nama  : " + HimpunanNama);

    }
}
