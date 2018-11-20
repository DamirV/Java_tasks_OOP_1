package Cycles;

import java.util.Scanner;


public class Main {

    public static void printA() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void printB() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void printC() {
        for (int i = 0; i < 8; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = i; j < 8; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void printD() {
        for (int i = 0; i < 8; i++) {
            for (int k = i; k < 8 - 1; k++) {
                System.out.print(" ");
            }

            for (int j = i + 1; j > 0; j--) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void printE() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("#");
                } else {
                    if (j == 0 || j == 6) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void printF() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("#");
                } else {
                    if (i == j) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void printG() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("#");
                } else {
                    if (6 - i == j) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void printH() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("#");
                } else {
                    if (i == j || 6 - i == j) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void printI() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("#");
                } else {
                    if (i == j || 6 - i == j || j == 0 || j == 6) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }


    public static void printRectangle(int width, int height) {

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        int flag;
        int width;
        int height;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1 - Вывести прямоугольник");
            System.out.println("2 - Вывод фигур");
            System.out.println("0 - Выход");
            flag = sc.nextInt();

            switch (flag) {
                case 1:
                    System.out.println("Введите длину: ");
                    width = sc.nextInt();
                    System.out.println("Введите ширину: ");
                    height = sc.nextInt();
                    printRectangle(width, height);

                    break;

                case 2:
                    System.out.println();
                    printA();
                    printB();
                    printC();
                    printD();
                    printE();
                    printF();
                    printG();
                    printH();
                    printI();
                    break;

                case 0:
                    return;
            }
        }
    }

}

