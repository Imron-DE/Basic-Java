package day3.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "D:\\Bootcampp Aigen\\Basic-java\\basic-java\\src\\day3\\FileHandling\\test1.txt";
        File file = new File(fileName);

        try (BufferedWriter writer= new BufferedWriter(new FileWriter(file))){
            writer.write("Saya ingin menjadi Superhero");
            writer.newLine();// untuk membuat garis baru
            writer.write("Superhero dalam artian");
            writer.newLine();
            writer.write(" Bisa berguna untuk kebaikan");

            System.out.println("======");
            System.out.println("File berhasil dibuat\n path: " + file.getAbsolutePath());
            System.out.println("======");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
