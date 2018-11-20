package factorial;

import java.util.Scanner;

public class Main {

    public static long recFact(long num) {

        if (num == 1 || num == 0) {
            return 1;
        }

        num *= recFact(num - 1);
        return num;
    }

    public static long cycFact(int num) {
        long res = 1;

        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        int flag;
        int num;
        long time;
        long tempRes;

        System.out.println("Введите число: ");
        num = sc.nextInt();
        while (num < 0) {
            System.out.println("Число не может быть отрицательным");
            System.out.println("Введите число: ");
            num = sc.nextInt();
        }

        while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Факториал числа: " + num);
            System.out.println("1 - Провести тест");
            System.out.println("2 - Задать новое число");
            System.out.println("0 - Выход");
            flag = sc.nextInt();

            switch (flag) {
                case 1:
                    time = System.nanoTime();
                    tempRes = recFact(num);
                    time = System.nanoTime() - time;
                    System.out.println("С помощью функции recFact(): " + tempRes + ", " + time + " нс");

                    time = System.nanoTime();
                    tempRes = cycFact(num);
                    time = System.nanoTime() - time;
                    System.out.println("С помощью функции cycFact(): " + tempRes + ", " + time + " нс");
                    break;

                case 2:
                    System.out.println("Введите число: ");
                    num = sc.nextInt();

                    while (num < 0) {
                        System.out.println("Число не может быть отрицательным");
                        System.out.println("Введите число: ");
                        num = sc.nextInt();
                    }
                    break;

                case 0:
                    return;
            }
        }
    }
}
