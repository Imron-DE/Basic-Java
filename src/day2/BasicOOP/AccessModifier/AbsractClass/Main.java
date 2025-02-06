package day2.BasicOOP.AccessModifier.AbsractClass;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class turunannya hewan
        Kucing kucingOyen = new Kucing("Jack", 2);

        // akses methode
        kucingOyen.makan();
        kucingOyen.tidur();

        // akses getter
        System.out.println("Nama : " + kucingOyen.getNama());
        System.out.println("Umur : " + kucingOyen.getUmur());
    }
}
