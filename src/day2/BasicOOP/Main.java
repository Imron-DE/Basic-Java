package day2.BasicOOP;

import day2.BasicOOP.Basic.Human;
public class Main {
    public static void main(String[] args) {
        // instance creation dari class Human : proses embuat objek baru dari sebuah class
        Human student = new Human("imron", 30);

        // instance method :method yang bisa di askses oleh objek yang menampung suatu objek
        student.fart();
        student.breath();
    }
}
