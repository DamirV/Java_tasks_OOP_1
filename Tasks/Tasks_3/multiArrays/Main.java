package multiArrays;

import java.util.Arrays;

import static java.lang.Math.abs;

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
        int mainSum = 0;
        long mainComp = 1;
        int sideSum = 0;
        long sideComp = 1;

        int[][] matrix = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = (int) (Math.random() * 99) + 1;


            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (i == j) {
                    mainSum += matrix[i][j];
                    mainComp *= matrix[i][j];

                    sideSum += matrix[7 - i][j];
                    sideComp *= matrix[7 - i][j];
                }
            }
        }

        System.out.println("-----------------TaskA-------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Сумма элементов главной диагонали: " + mainSum +
                " ,Произведение элементов главной диагонали: " + mainComp);

        System.out.println("Сумма элементов побочной диагонали: " + sideSum +
                " ,Произведение элементов побочной диагонали: " + sideComp);
        System.out.println();
    }

    public static void taskB() {
        int max = -100;
        int maxi = 0;
        int maxj = 0;
        int[][] matrix = new int[8][5];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 199) - 99;

                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }

        System.out.println("-----------------TaskB-------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Максимальный элемент = " + max + " , с индексами [" + maxi +
                "][" + maxj + "]");
        System.out.println();
    }

    public static void taskC() {
        int maxi = 0;
        long comp = -1;
        long tempComp;
        int[][] matrix = new int[8][5];

        for (int i = 0; i < 8; i++) {

            tempComp = 1;

            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 21) - 10;
                tempComp *= matrix[i][j];
            }

            if (abs(tempComp) >= abs(comp)) {
                comp = tempComp;
                maxi = i;
            }
        }

        System.out.println("-----------------TaskC-------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Строка с наибольшим по модулю произведением элементов: " + maxi);
        System.out.println();
    }

    public static void taskD() {
        int[][] matrix = new int[10][7];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("-----------------TaskD-------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        for (int i = 0; i < 10; i++) {
            Arrays.sort(matrix[i]);
            reverse(matrix[i]);
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public static void main(String[] argv) {
        taskA();
        taskB();
        taskC();
        taskD();
    }

}