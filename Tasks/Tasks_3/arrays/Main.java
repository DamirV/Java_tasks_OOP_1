package arrays;

import java.util.Arrays;

public class Main {

    public static void reverse(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void taskA() {

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        System.out.println("----------------taskA----------------");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void taskB() {
        int even = 0;
        int uneven = 0;
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 11);
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                uneven++;
            }
        }
        System.out.println("----------------taskB----------------");
        System.out.println(Arrays.toString(arr) + "\nЧетные:" + even + ",Нечетные: " + uneven + "\n");

    }

    public static void taskC() {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("----------------taskC----------------");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void taskD() {
        int maxi = 0;
        int mini = 0;
        int max = -100;
        int min = 100;
        int[] arr = new int[15];

        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * 101 - 50);
            if (arr[i] >= max) {
                max = arr[i];
                maxi = i;
            }

            if (arr[i] <= min) {
                min = arr[i];
                mini = i;
            }
        }

        System.out.println("----------------taskD----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("Min[" + mini + "]:" + min + ", Max[" + maxi + "]:" + max + "\n");
    }

    public static void taskE() {

        double m1 = 0;
        double m2 = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 11);
            arr2[i] = (int) (Math.random() * 11);

            m1 += arr1[i];
            m2 += arr2[i];
        }
        m1 /= 10;
        m2 /= 10;

        System.out.println("----------------taskE----------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Среднее для первого массива: " + m1);
        System.out.println("Среднее для второго массива: " + m2);

        if (m1 > m2) {
            System.out.println("Среднее для первого массива больше чем для второго\n");
        } else {
            if (m2 > m1) {
                System.out.println("Среднее для второго больше чем для первого\n");
            } else {
                System.out.println("Среднее для обоих массивов равно\n");
            }
        }
    }

    public static void taskF() {

        int one = 0;
        int minusOne = 0;
        int zero = 0;

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 3) - 1;
            if (arr[i] == -1) {
                minusOne++;
            } else {
                if (arr[i] == 1) {
                    one++;
                } else {
                    zero++;
                }
            }

        }

        System.out.println("----------------taskF----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("Минус один: " + minusOne + "\nОдин: " + one + "\nНоль: " + zero);

        if (one > zero && one > minusOne) {
            System.out.println("Единиц больше");
            if (zero == minusOne) {
                System.out.println("Нулей и мнус единиц поровну");
            }
        }

        if (zero > one && zero > minusOne) {
            System.out.println("Нулей больше");
            if (one == minusOne) {
                System.out.println("Единиц и минус единиц поровну");
            }
        }

        if (minusOne > one && minusOne > zero) {
            System.out.println("Минус единиц больше");
            if (one == zero) {
                System.out.println("Единиц и нулей поровну");
            }
        }

        if (one == zero && one > minusOne) {
            System.out.println("Единиц и нулей поровну");
        }

        if (zero == minusOne && zero > one) {
            System.out.println("Минус единиц и нулей поровну");
        }

        if (minusOne == one && minusOne > zero) {
            System.out.println("Минус единиц и единиц поровну");
        }

        System.out.print("\n");

    }

    public static void main(String[] args) {

        taskA();
        taskB();
        taskC();
        taskD();
        taskE();
        taskF();
    }

}