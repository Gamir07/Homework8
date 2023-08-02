import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"Hello", "Bye", "OK", "JAVA"};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"Hello", "Bye", "OK", "JAVA"};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"Hello", "Bye", "OK", "JAVA"};

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}