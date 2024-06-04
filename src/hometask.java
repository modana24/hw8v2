public class hometask {
    public static void main(String[] args) {
        // задача 1
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        int[] third = {9, 6, 24, 24, 21, 27, 22, 27};

        //задача 2
        //печать первого массива
        for (int index = 0; index <= first.length; index++) {
            if (index == first.length - 1) {
                System.out.println(first[index]);
                break;
            }
            System.out.print(first[index] + ",");
        }
        //печать второго массива
        for (int index = 0; index <= second.length; index++) {
            if (index == second.length - 1) {
                System.out.println(second[index]);
                break;
            }
            System.out.print(second[index] + ",");
        }
        //печать третьего массива
        for (int index = 0; index <= third.length; index++) {
            if (index == third.length - 1) {
                System.out.println(third[index]);
                break;
            }
            System.out.print(third[index] + ",");
        }
        System.out.println();
        //задача 3
        //печать первого массива в обратном порядке
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //печать второго массива в обратном порядке
        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        //печать третьего массива в обратном порядке
        for (int i = third.length - 1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println();

        //задача 4
        for (int index = 0; index <= first.length; index ++) {
            first[index] ++;
            if (index % 2 == 0) {
                System.out.print(first[index] + ",");

            }
        }
    }
}
