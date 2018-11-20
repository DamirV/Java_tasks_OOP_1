package collectionsTesting;

import java.util.*;

import static collectionsTesting.FirstComparison.firstComparison;
import static collectionsTesting.SecondComparison.secondComparison;
import static collectionsTesting.ThirdComparison.thirdComparison;

public class Main {

    public static void main(String[] argv) {
        int flag;
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер коллекции: ");
        size = sc.nextInt();

        while (true) {

            System.out.println("----------------------------------------------");
            System.out.println("Размер коллекции: " + size);
            System.out.println("1 - Сравнение ArrayList и LinkedList");
            System.out.println("2 - Сравнение HashSet, LinkedHashSet и TreeSet");
            System.out.println("3 - Сравнение HashMap, LinkedHashMap и TreeMap");
            System.out.println("4 - Изменить размер коллекции");
            System.out.println("0 - Выход");
            System.out.println();

            flag = sc.nextInt();
            switch (flag) {

                case 1:
                    firstComparison(size);
                    break;

                case 2:
                    secondComparison(size);
                    break;

                case 3:
                    thirdComparison(size);
                    break;

                case 4:
                    System.out.println("Введите размер коллекции: ");
                    size = sc.nextInt();
                    break;

                case 0:
                    return;
            }
        }
    }
}
