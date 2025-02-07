package day3.FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        // menggunakan absolutpath (path lengkap) untuk akses file
        String filePath = "D:\\Bootcampp Aigen\\Basic-java\\basic-java\\src\\day3\\FileHandling\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            for (String line1 : reader.lines().toArray(String[]::new)) {
                System.out.println(line1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
