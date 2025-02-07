package day3.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        try {
            // cek nilai di indeks ke-3
            int checkNumber= numbers[3];
            System.out.println("Nilai yang diakses :" + checkNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            // error handling jika gagal
            System.out.println("Indeks array tidak valid");
            System.out.println("Error : " + e.getMessage());
        }
    }
}
