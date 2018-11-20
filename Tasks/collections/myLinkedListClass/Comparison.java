package myLinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Comparison {
    public static void comparsion(int size){
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
    }
}
