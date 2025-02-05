package day1.Array;

import java.util.Arrays;

public class ArrayMethode {
    public static void main(String[] args) {
        System.out.println("== ARRAY BIASA ==");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Lenght : " + numbers.length);
        numbers[4] = 7; // untuk ganti indeks ke empat menjadi 7

        System.out.println("== ARRAY METHODE ==");
        System.out.println("== SORT ==");
        Integer sortArray[] = {2, 4, 7, 3, 5, 6, 1};
        // methode array untuk mengurutkan data ASC
        java.util.Arrays.sort(sortArray);
        for (int i : sortArray) {
            System.out.println("sorted array = " + i);

        }

        System.out.println("=== FILLL ==");
        // Methode fill :methode untuk mengisi semua indexs array dengan nilai yang sama
        int[] fillsNumbers = new int[5];
        Arrays.fill(fillsNumbers, 7); // buat mengisi semua data jadi
        for(int i : fillsNumbers) {
            System.out.println("fill array = " + i);}

            System.out.println("=== COPY OF ARRAY ===");
            // methode copyof : methode untuk membuat array baru dengan data yang sama
            int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
            for (int i : copyNumbers) {
                System.out.println("copy array = " + i);
            }

            // menyalin data array dari new number ke array newNumbers dan nambahin panjang datanya 1
            int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
            newNumbers[5] = 50;
            for (int i : newNumbers) {
                System.out.println("new array = " + i);
            }


        // coppyofrange array : menyallin array dari tange tertentu
        System.out.println("=== COPY OF RANGE ARRAY ===");
            int[] equalNumber1={1,2,3,4,5};
            int[] equalNumber2={1,2,3,4,5};
            boolean isEqual = Arrays.equals(equalNumber1, equalNumber2);
            System.out.println("isEqual = " + isEqual);

            int search =4;
            for(int i : equalNumber1) {
                if (equalNumber1[i] == search) {
                    System.out.println("Valeu 4 is not exist");
                    System.out.println("current value" + equalNumber1[i]);
                    break; // buat menghentikan proses loading ketika kondisi terpenuhi

                }

            }

            System.out.println("=== Covert equal to string ===");
            String arrayToString = Arrays.toString(newNumbers);
            System.out.println("array to sting " + arrayToString);


        }

}
