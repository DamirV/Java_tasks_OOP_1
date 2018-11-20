package myLinkedListClass;
import java.util.*;

import static myLinkedListClass.Comparison.comparsion;
import static myLinkedListClass.Tests.testing;

public class MainClass {
    public static void main(String[] argv){
        int flag;
        Scanner sc = new Scanner(System.in);
        int size = 100000;

        while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Размер коллекций: " + size);
            System.out.println("1 - Тестировать MyLinkedList");
            System.out.println("2 - Сравнить MyLinkedList с LinkedList");
            System.out.println("3 - Изменить разщмер коллекции для сравнения MyLinkedList с LinkedList");
            System.out.println("0 - Выход");
            flag = sc.nextInt();
            switch (flag) {
                case 1:
                    testing();
                break;

                case 2:
                   comparsion(size);
                    break;

                case 3:

                    System.out.println("Введите размер: ");
                    size = sc.nextInt();
                    break;

                case 0:
                    return;
            }
        }

    }
}