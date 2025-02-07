package day3.FileHandling;

import java.io.*;

public class EditFile {
    public static void main(String[] args) {
        String fileName = "D:\\Bootcampp Aigen\\Basic-java\\basic-java\\src\\day3\\FileHandling\\test1.txt";
        File file = new File(fileName);

        // buat kontent baru setelah pengedtitan
        StringBuilder newContent = new StringBuilder();

        // cek  file ada atau tidak
        if(file.exists()){
            // buka file
            try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                for(String line;(line = reader.readLine()) != null;){
                    // ganti kata
                    line=line.replace("Superhero", "Programmer");
                    newContent.append(line).append(System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // edit file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                // ini buat overwrite
                writer.write(newContent.toString());
                // ini untuk menambahkan kata baru
                writer.append("123456789").append(System.lineSeparator());
                System.out.println("File berhasil diedit\n path: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File tidak ditemukan\n path: " + file.getAbsolutePath());
        }
    }
}
