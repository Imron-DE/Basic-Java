package day1.Array;

public class ArrayMulti {
    public static void main(String[] args) {
        Integer[][][] array3D = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };

        for (Integer[][] integers : array3D) {
            for (Integer[] integer : integers) {
                for (Integer value : integer) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
