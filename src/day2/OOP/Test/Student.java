package day2.OOP.Test;

public class Student {
    public String nama;
    public int nim;
    private int studentNilai;


    public Student(String studentNama, int studentNim, int studentNilai) {
        this.nama = studentNama;
        this.nim = studentNim;
        this.studentNilai = studentNilai;
    }


    public int getNilai() {
        return studentNilai;
    }


    public void setNilai(int nilai) {
        this.studentNilai = nilai;
    }


    public void displayStudent() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + studentNilai);
        System.out.println("=======================");
    }


}
