package collectionsTesting;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static collectionsTesting.Functions.*;
import static collectionsTesting.Functions.bypass;

public class SecondComparison {
    public static void secondComparison(int size){

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("-------------Заполнение-------------");
        System.out.println("HashSet: " + filling(hashSet, size) + " нс");
        System.out.println("LinkedHashSet: " + filling(linkedHashSet, size) + " нс");
        System.out.println("TreeSet: " + filling(treeSet, size) + " нс");
        System.out.println();


        System.out.println("-------------Вставка-------------");
        System.out.println("---Начало---");
        System.out.println("HashSet: " + adding(hashSet, 0) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, 0) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, 0) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashSet: " + adding(hashSet, size/2) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, size/2) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashSet: " + adding(hashSet, size-1) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, size-1) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, size-1) + " нс");
        System.out.println();


        System.out.println("-------------Удаление-------------");
        System.out.println("---Начало---");
        System.out.println("HashSet: " + delete(hashSet, 0) + " нс");
        System.out.println("LinkedHashSet: " + delete(linkedHashSet, 0) + " нс");
        System.out.println("TreeSet: " + delete(treeSet, 0) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashSet: " + delete(hashSet, size/2) + " нс");
        System.out.println("LinkedHashSet: " + delete(linkedHashSet, size) + " нс");
        System.out.println("TreeSet: " + delete(treeSet, size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashSet: " + delete(hashSet, size-1) + " нс");
        System.out.println("LinkedHashSet: " + delete(linkedHashSet, size) + " нс");
        System.out.println("TreeSet: " + delete(treeSet, size-1) + " нс");
        System.out.println();


        System.out.println("-------------Добавление-------------");
        System.out.println("---Начало---");
        System.out.println("HashSet: " + adding(hashSet, 0) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, 0) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, 0) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashSet: " + adding(hashSet, size/2) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, size/2) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashSet: " + adding(hashSet, size-1) + " нс");
        System.out.println("LinkedHashSet: " + adding(linkedHashSet, size-1) + " нс");
        System.out.println("TreeSet: " + adding(treeSet, size-1) + " нс");
        System.out.println();


        System.out.println("-------------Обход-------------");
        System.out.println("HashSet: " + bypass(hashSet) + " нс");
        System.out.println("LinkedHashSet: " + bypass(linkedHashSet) + " нс");
        System.out.println("TreeSet: " + bypass(treeSet) + " нс");
        System.out.println();
    }
}
