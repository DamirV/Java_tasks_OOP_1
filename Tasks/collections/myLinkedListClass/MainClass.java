package myLinkedListClass;
import java.util.*;

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
                break;

                case 2:
                    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
                    List<Integer> linkedList = new LinkedList<>();

                    long time;

                    System.out.println("Время заполнения коллекций:");
                    time = System.nanoTime();
                    for(int i = 0; i < size; i++){
                        myLinkedList.add(i);
                    }
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    for(int i = 0; i < size; i++){
                        linkedList.add(i);
                    }
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время изменения первого элемента:");
                    time = System.nanoTime();
                    myLinkedList.set(0, size);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.set(0,size);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время изменения центрального элемента:");
                    time = System.nanoTime();
                    myLinkedList.set(size/2, size);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.set(size/2, size);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время изменения последнего элемента:");
                    time = System.nanoTime();
                    myLinkedList.set(size-1, size);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.set(size-1, size);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();

                    System.out.println("Время удаления последнего элемента:");
                    time = System.nanoTime();
                    myLinkedList.remove(size - 1);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.remove(size-1);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время удаления первого элемента:");
                    time = System.nanoTime();
                    myLinkedList.remove(0);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.remove(0);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время удаления центрального элемента:");
                    time = System.nanoTime();
                    myLinkedList.remove(size/2);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.remove(size/2);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время добавления элемента в конец:");
                    time = System.nanoTime();
                    myLinkedList.add(1000);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.add(1000);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время добавления элемента в начало:");
                    time = System.nanoTime();
                    myLinkedList.add(0, 1000);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.add(0, 1000);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время добавления элемента в середину:");
                    time = System.nanoTime();
                    myLinkedList.add(size/2, 1000);
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    linkedList.add(size/2, 1000);
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();


                    System.out.println("Время обхода коллекций:");
                    Iterator<Integer> i1 = myLinkedList.iterator();
                    Iterator<Integer> i2 = linkedList.iterator();

                    time = System.nanoTime();
                    while (i1.hasNext()) {
                       i1.next();
                    }
                    time = System.nanoTime() - time;
                    System.out.println("MyLinkedList: " + time);

                    time = System.nanoTime();
                    while (i2.hasNext()) {
                       i2.next();
                    }
                    time = System.nanoTime() - time;
                    System.out.println("LinkedList: " + time);
                    System.out.println();
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