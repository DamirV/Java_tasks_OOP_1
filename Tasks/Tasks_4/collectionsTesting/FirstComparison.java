package collectionsTesting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static collectionsTesting.Functions.*;
import static collectionsTesting.Functions.adding;
import static collectionsTesting.Functions.delete;

public class FirstComparison {
    public static void firstComparison(int size){

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("-------------Заполнение-------------");
        System.out.println("ArrayList: " + filling(arrayList, size) + " нс");
        System.out.println("LinkedList: " + filling(linkedList, size) + " нс");
        System.out.println();


        System.out.println("-------------Вставка-------------");
        System.out.println("---Начало---");
        System.out.println("ArrayList: " + insert(arrayList,0, size) + " нс");
        System.out.println("LinkedList: " + insert(linkedList,0, size) + " нс");

        System.out.println("---Середина---");
        System.out.println("ArrayList: " + insert(arrayList,size/2, size) + " нс");
        System.out.println("LinkedList: " + insert(linkedList,size/2, size) + " нс");

        System.out.println("---Конец---");
        System.out.println("ArrayList: " + insert(arrayList,size-1, size) + " нс");
        System.out.println("LinkedList: " + insert(linkedList,size-1, size) + " нс");
        System.out.println();


        System.out.println("-------------Доступ-------------");
        System.out.println("---Начало---");
        System.out.println("ArrayList: " + access(arrayList,0) + " нс");
        System.out.println("LinkedList: " + access(linkedList,0) + " нс");

        System.out.println("---Середина---");
        System.out.println("ArrayList: " + access(arrayList,size/2) + " нс");
        System.out.println("LinkedList: " + access(linkedList,size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("ArrayList: " + access(arrayList,size-1) + " нс");
        System.out.println("LinkedList: " + access(linkedList,size-1) + " нс");
        System.out.println();


        System.out.println("-------------Добавление-------------");
        System.out.println("---Начало---");
        System.out.println("ArrayList: " + adding(arrayList,0,size) + " нс");
        System.out.println("LinkedList: " + adding(linkedList,0,size) + " нс");

        System.out.println("---Середина---");
        System.out.println("ArrayList: " + adding(arrayList,size/2,size) + " нс");
        System.out.println("LinkedList: " + adding(linkedList,size/2,size) + " нс");

        System.out.println("---Конец---");
        System.out.println("ArrayList: " + adding(arrayList,size+2,size) + " нс");
        System.out.println("LinkedList: " + adding(linkedList,size+2,size) + " нс");
        System.out.println();


        System.out.println("-------------Удаление-------------");
        System.out.println("---Начало---");
        System.out.println("ArrayList: " + delete(arrayList,0) + " нс");
        System.out.println("LinkedList: " + delete(linkedList,0) + " нс");

        System.out.println("---Середина---");
        System.out.println("ArrayList: " + delete(arrayList,size/2) + " нс");
        System.out.println("LinkedList: " + delete(linkedList,size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("ArrayList: " + delete(arrayList,size) + " нс");
        System.out.println("LinkedList: " + delete(linkedList,size) + " нс");
        System.out.println();
    }
}
