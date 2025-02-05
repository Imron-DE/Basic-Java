package day1.Logic;

public class LogicStatement {
    public static void main(String[] args) {
        int nilai = 10;
//     if
        if(nilai == 10 ){
            System.out.println("nilaimu bagus ");
        }

        // if - else
        int nilaiSiswa =75;
        if (nilaiSiswa >= 60){
            System.out.println("lulus");
        } else {
            System.out.println("Dropout");
        }

        // if-else-if
        if (nilaiSiswa >=90){
            System.out.println("nilai A");
        } else if (nilaiSiswa >= 80) {
            System.out.println("nilai B");
        } else {
            System.out.println("nilai C");
        }

        ///  switch case
        char grade = 'b';
        switch (grade){
            case 'A':
                System.out.println("sangat baik");
                break;
            case 'B' :
                System.out.println("Baik");
                break;
            case  'C' :
                System.out.println("Nilai tidak valid");
        }

    }
}
