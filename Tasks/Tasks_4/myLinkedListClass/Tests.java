package myLinkedListClass;

import java.util.Arrays;
import java.util.Iterator;

public class Tests {
    public static void testing(){
        MyLinkedList<Integer> l = new MyLinkedList<>();

        System.out.println("--------------Заполнение коллекции--------------");
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }

        System.out.println("EXPECT: 0 1 2 3 4 5 6 7 8 9");
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Размер коллекции--------------");
        System.out.println("EXPECT: 10");
        System.out.println("size: " + l.size());
        System.out.println();

        System.out.println("--------------В массив--------------");
        Object[] mas = l.toArray();
        System.out.println("EXPECT: 0 1 2 3 4 5 6 7 8 9");
        System.out.println(Arrays.toString(mas));
        System.out.println();

        System.out.println("--------------Удаление первого элемента--------------");
        System.out.println("EXPECT: 0, 9, 1 2 3 4 5 6 7 8 9");
        System.out.println(l.remove(0));
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Удаление последнего элемента--------------");
        System.out.println("EXPECT: 9, 8, 1 2 3 4 5 6 7 8");
        System.out.println(l.remove(l.size() - 1));
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Удаление элемента из середины--------------");
        System.out.println("EXPECT: 4, 7, 1 2 3 5 6 7 8");
        System.out.println(l.remove(3));
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Изменение первого элемента--------------");
        System.out.println("EXPECT: 1, 10 2 3 5 6 7 8");
        System.out.println(l.set(0, 10));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Изменение последнего элемента--------------");
        System.out.println("EXPECT: 8, 10 2 3 5 6 7 10");
        System.out.println(l.set(l.size()-1, 10));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Изменение элемента из середины--------------");
        System.out.println("EXPECT: 5, 10 2 3 10 6 7 10");
        System.out.println(l.set(3, 10));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Добавление в начало коллекции--------------");
        System.out.println("EXPECT: 8, 100 10 2 3 10 6 7 10");
        l.add(0, 100);
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Добавление в конец коллекции--------------");
        System.out.println("EXPECT: 9, 0 10 2 3 10 6 7 10 100");
        l.add(l.size(), 100);
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Добавление в середину коллекции--------------");
        System.out.println("EXPECT: 10, 0 10 2 3 10 100 6 7 10 100");
        l.add(5, 100);
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Получить первый элемент--------------");
        System.out.println("EXPECT: 100, 100 10 2 3 10 100 6 7 10 100");
        System.out.println(l.get(0));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Получить последний элемент--------------");
        System.out.println("EXPECT: 100, 100 10 2 3 10 100 6 7 10 100");
        System.out.println(l.get(l.size() - 1));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Получить элемент из середины--------------");
        System.out.println("EXPECT: 100, 100 10 2 3 10 100 6 7 10 100");
        System.out.println(l.get(5));
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Стереть коллекцию--------------");
        System.out.println("EXPECT: 0, null");
        l.clear();
        System.out.println("size: " +l.size());
        System.out.println(l);
        System.out.println();

        System.out.println("--------------Итератор--------------");
        System.out.println("EXPECT: 0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();
    }
}
