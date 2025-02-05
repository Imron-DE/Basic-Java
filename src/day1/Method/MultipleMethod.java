package day1.Method;

public class MultipleMethod {
   //  methode eksternal
    public static int multiple(int num1, int num2) {
        return num1 * num2;
    }
    // Method overload : membuat methode dengan nama yang sama tapi dengan hasil tipe ddata dan param yang beda
    public static int multiple(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
    public static double multiple(double num1, double num2) {
        return num1 * num2;
    }
}
