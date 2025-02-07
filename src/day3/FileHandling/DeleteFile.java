package day3.FileHandling;
import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "D:\\Bootcampp Aigen\\Basic-java\\basic-java\\src\\day3\\FileHandling\\test1.txt";
        File file = new File(fileName);
        if(file.delete()) {
            System.out.println("File bethasil dihapus =>");
        } else {
            System.out.println("gagal menghapus File => ");
        }
    }
}
