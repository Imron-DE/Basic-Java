package day1.MathMethode;

public class MathMethode {
    public static void main(String[] args) {
        float phi = (float) Math.PI;
        System.out.println("Math.PI : " + phi);

        double floorValue = Math.floor(3.8);
        System.out.println("Math Floor : " + floorValue);

        double  ceilValue = Math.ceil(3.2);
        System.out.println("Math Ceil : " + ceilValue);

        double roundValue = Math.round(3.4);
        System.out.println("Math round : " + roundValue);

        double squareValue = Math.sqrt(64);
        System.out.println("Math SQUARE : " + squareValue );

        double powerOfTwo = Math.pow(4,2);
        System.out.println("Math.Pow " + powerOfTwo );

        int min = Math.min (10,5);
        System.out.println( "Min" + min);

        int max = Math.max(10,5);
        System.out.println("Max" + max);

        double  randomValue = Math.random();
        System.out.println("Match.random" + randomValue);

    }
}
