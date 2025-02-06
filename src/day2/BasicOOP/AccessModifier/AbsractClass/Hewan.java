package day2.BasicOOP.AccessModifier.AbsractClass;

// Abstract class : class yang tidak bisa dinuat instance creation secara langsung
// atau tidak bisa untuk membuat objek secara langsung , cuma bisa di pakai buat class , subclass nya dan turunanya


public abstract class Hewan {
    public String nama;
    public int umur;
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Abstact method : method yang harus di implementasikan oleh class turunannya
    // kalau tidak diimplmentasikan, maka class turunanya juga bakal jadi abstract
    // tdak bisa dibuat secara lagsung
    public abstract void makan();

    // method biasa
    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    // getter /setter (getter untuk mengambil data , setter untuk mengubah data)
    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
}
