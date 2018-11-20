package collectionsTesting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static collectionsTesting.Functions.*;
import static collectionsTesting.Functions.bypass;

public class ThirdComparison {
    public static void thirdComparison(int size){

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("-------------Заполнение-------------");
        System.out.println("HashMap: " + filling(hashMap, size) + " нс");
        System.out.println("LinkedHashMap: " + filling(linkedHashMap, size) + " нс");
        System.out.println("TreeMap: " + filling(treeMap, size) + " нс");
        System.out.println();


        System.out.println("-------------Вставка-------------");
        System.out.println("---Начало---");
        System.out.println("HashMap: " + insert(hashMap,0, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,0, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,0, size) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashMap: " + insert(hashMap,size/2, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,size/2, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,size/2, size) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashMap: " + insert(hashMap,size-1, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,size-1, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,size-1, size) + " нс");
        System.out.println();


        System.out.println("-------------Удаление-------------");
        System.out.println("---Начало---");
        System.out.println("HashMap: " + delete(hashMap, 0) + " нс");
        System.out.println("LinkedHashMap: " + delete(linkedHashMap, 0) + " нс");
        System.out.println("TreeMap: " + delete(treeMap, 0) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashMap: " + delete(hashMap, size/2) + " нс");
        System.out.println("LinkedHashMap: " + delete(linkedHashMap, size/2) + " нс");
        System.out.println("TreeMap: " + delete(treeMap, size/2) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashMap: " + delete(hashMap, size-1) + " нс");
        System.out.println("LinkedHashMap: " + delete(linkedHashMap, size-1) + " нс");
        System.out.println("TreeMap: " + delete(treeMap, size-1) + " нс");
        System.out.println();


        System.out.println("-------------Добавление-------------");
        System.out.println("---Начало---");
        System.out.println("HashMap: " + insert(hashMap,0, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,0, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,0, size) + " нс");

        System.out.println("---Середина---");
        System.out.println("HashMap: " + insert(hashMap,size/2, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,size/2, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,size/2, size) + " нс");

        System.out.println("---Конец---");
        System.out.println("HashMap: " + insert(hashMap,size-1, size) + " нс");
        System.out.println("LinkedHashMap: " + insert(linkedHashMap,size-1, size) + " нс");
        System.out.println("TreeMap: " + insert(treeMap,size-1, size) + " нс");
        System.out.println();


        System.out.println("-------------Обход-------------");
        System.out.println("HashMap: " + bypass(hashMap) + " нс");
        System.out.println("LinkedHashMap: " + bypass(linkedHashMap) + " нс");
        System.out.println("TreeMap: " + bypass(treeMap) + " нс");
        System.out.println();

    }
}
