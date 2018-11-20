package sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void selectionSort(int[] arr) {
        int min;
        int pos;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            pos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        int flag;
        int[] arr;
        int[] selectionArr;
        int[] bubbleArr;
        int[] sortArr;
        long time;

        System.out.println("Введите длину массива: ");
        flag = sc.nextInt();

        arr = new int[flag];

        for (int i = 0; i < flag; i++) {
            arr[i] = (int) (random() * 100);
        }

        while (true) {
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Длинна массива: " + arr.length);
            if (arr.length <= 30) {
                System.out.println("arr=" + Arrays.toString(arr));
            }

            System.out.println("1 - Провести тест");
            System.out.println("2 - Пересоздать массив");
            System.out.println("3 - Задать свой массив");
            System.out.println("0 - Выход");
            flag = sc.nextInt();

            switch (flag) {
                case 1:
                    selectionArr = arr.clone();
                    bubbleArr = arr.clone();
                    sortArr = arr.clone();

                    time = System.nanoTime();
                    selectionSort(selectionArr);
                    time = System.nanoTime() - time;
                    if (arr.length <= 30) {
                        System.out.println("arr=" + Arrays.toString(selectionArr));
                    }
                    System.out.println("Время работы selectionSort(): " + time / 1000000000.0 + " с\n");

                    time = System.nanoTime();
                    bubbleSort(bubbleArr);
                    time = System.nanoTime() - time;
                    if (arr.length <= 30) {
                        System.out.println("arr=" + Arrays.toString(bubbleArr));
                    }
                    System.out.println("Время работы bubbleSort(): " + time / 1000000000.0 + " с\n");

                    time = System.nanoTime();
                    Arrays.sort(sortArr);
                    time = System.nanoTime() - time;
                    if (arr.length <= 30) {
                        System.out.println("arr=" + Arrays.toString(sortArr));
                    }
                    System.out.println("Время работы arrays.sort(): " + time / 1000000000.0 + " сек\n");
                    break;

                case 2:
                    System.out.println("Введите длину массива: ");
                    flag = sc.nextInt();
                    arr = new int[flag];

                    for (int i = 0; i < flag; i++) {
                        arr[i] = (int) (random() * 100);
                    }
                    break;

                case 3:
                    System.out.println("Введите длину массива: ");
                    flag = sc.nextInt();
                    arr = new int[flag];

                    for (int i = 0; i < flag; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 0:
                    return;
            }
        }
    }
}
