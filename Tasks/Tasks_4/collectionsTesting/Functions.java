package collectionsTesting;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Functions {

    public static long filling(Collection<Integer> collection, int size) {
        long time;
        time = System.nanoTime();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        time = System.nanoTime() - time;

        return time;
    }

    public static long filling(Map<Integer, Integer> map, int size) {
        long time;
        time = System.nanoTime();
        for (int i = 0; i < size; i++) {
            map.put(i, i);
        }
        time = System.nanoTime() - time;
        return time;
    }

    public static long insert(List<Integer> list, int index, int value) {
        long time;
        time = System.nanoTime();
        list.set(index, value);
        time = System.nanoTime() - time;

        return time;
    }

    public static long insert(Map<Integer, Integer> list, int index, int value) {
        long time;
        time = System.nanoTime();
        list.put(index, value);
        time = System.nanoTime() - time;

        return time;
    }


    public static long access(List<Integer> list, int index) {
        long time;
        time = System.nanoTime();
        list.get(index);
        time = System.nanoTime() - time;

        return time;
    }

    public static long adding(List<Integer> list, int index, int value) {
        long time;
        time = System.nanoTime();
        list.add(index, value);
        time = System.nanoTime() - time;

        return time;
    }

    public static long adding(Collection<Integer> сollection, int value) {
        long time;
        time = System.nanoTime();
        сollection.add(value);
        time = System.nanoTime() - time;

        return time;
    }


    public static long delete(Collection<Integer> сollection, int index) {
        long time;
        time = System.nanoTime();
        сollection.remove(index);
        time = System.nanoTime() - time;

        return time;
    }


    public static long delete(Map<Integer, Integer> map, int key) {
        long time;
        time = System.nanoTime();
        map.remove(key);
        time = System.nanoTime() - time;

        return time;
    }

    public static long bypass(Collection<Integer> collection) {
        long time;
        time = System.nanoTime();
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        time = System.nanoTime() - time;

        return time;
    }

    public static long bypass(Map<Integer, Integer> map) {
        long time;
        time = System.nanoTime();
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        time = System.nanoTime() - time;

        return time;
    }
}
