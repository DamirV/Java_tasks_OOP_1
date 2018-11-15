package collectionsTesting;

import java.util.*;

public class Main {

    public static void comparisonMap(long[] hashMapTime, long[] linkedHashMapTime, long[] treeMapTime) {

        if (hashMapTime[0] < linkedHashMapTime[0] && hashMapTime[0] < treeMapTime[0]) {
            System.out.println("Время заполнения коллекции быстрее у HashMap");
        } else {
            if (linkedHashMapTime[0] < treeMapTime[0]) {
                System.out.println("Время заполнения коллекции быстрее у LinkedHashMap");
            } else {
                System.out.println("Время заполнения коллекции быстрее у TreeMap");
            }
        }

        if (hashMapTime[1] < linkedHashMapTime[1] && hashMapTime[1] < treeMapTime[1]) {
            System.out.println("Время вставки в последний элемент быстрее у HashMap");
        } else {
            if (linkedHashMapTime[1] < treeMapTime[1]) {
                System.out.println("Время вставки в последний элемент быстрее у LinkedHashMap");
            } else {
                System.out.println("Время вставки в последний элемент быстрее у TreeMap");
            }
        }

        if (hashMapTime[2] < linkedHashMapTime[2] && hashMapTime[2] < treeMapTime[2]) {
            System.out.println("Время вставки в первый элемент быстрее у HashMap");
        } else {
            if (linkedHashMapTime[2] < treeMapTime[2]) {
                System.out.println("Время вставки в первый элемент быстрее у LinkedHashMap");
            } else {
                System.out.println("Время вставки в первый элемент быстрее у TreeMap");
            }
        }

        if (hashMapTime[3] < linkedHashMapTime[3] && hashMapTime[3] < treeMapTime[3]) {
            System.out.println("Время вставки в центральный элемент быстрее у HashMap");
        } else {
            if (linkedHashMapTime[3] < treeMapTime[3]) {
                System.out.println("Время вставки в центральный элемент быстрее у LinkedHashMap");
            } else {
                System.out.println("Время вставки в центральный элемент быстрее у TreeMap");
            }
        }

        if (hashMapTime[4] < linkedHashMapTime[4] && hashMapTime[4] < treeMapTime[4]) {
            System.out.println("Время удаления последнего элемента быстрее у HashMap");
        } else {
            if (linkedHashMapTime[4] < treeMapTime[4]) {
                System.out.println("Время удаления последнего элемента быстрее у LinkedHashMap");
            } else {
                System.out.println("Время удаления последнего элемента быстрее у TreeMap");
            }
        }

        if (hashMapTime[5] < linkedHashMapTime[5] && hashMapTime[5] < treeMapTime[5]) {
            System.out.println("Время удаления центрального элемента быстрее у HashMap");
        } else {
            if (linkedHashMapTime[5] < treeMapTime[5]) {
                System.out.println("Время удаления центрального элемента быстрее у LinkedHashMap");
            } else {
                System.out.println("Время удаления центрального элемента быстрее у TreeMap");
            }
        }

        if (hashMapTime[6] < linkedHashMapTime[6] && hashMapTime[6] < treeMapTime[6]) {
            System.out.println("Время удаления первого элемента быстрее у HashMap");
        } else {
            if (linkedHashMapTime[6] < treeMapTime[6]) {
                System.out.println("Время удаления первого элемента быстрее у LinkedHashMap");
            } else {
                System.out.println("Время удаления первого элемента быстрее у TreeMap");
            }
        }

        if (hashMapTime[7] < linkedHashMapTime[7] && hashMapTime[7] < treeMapTime[7]) {
            System.out.println("Время обхода быстрее у HashMap");
        } else {
            if (linkedHashMapTime[7] < treeMapTime[7]) {
                System.out.println("Время обхода быстрее у LinkedHashMap");
            } else {
                System.out.println("Время обхода быстрее у TreeMap");
            }
        }
    }

    public static void comparisonHash(long[] hashTime, long[] linkHashTime, long[] TreeTime) {
        if (hashTime[0] < linkHashTime[0] && hashTime[0] < TreeTime[0]) {
            System.out.println("Время заполнения коллекции быстрее у HashSet");
        } else {
            if (linkHashTime[0] < TreeTime[0]) {
                System.out.println("Время заполнения коллекции быстрее у LinkedHashSet");
            } else {
                System.out.println("Время заполнения коллекции быстрее у TreeSet");
            }
        }

        if (hashTime[1] < linkHashTime[1] && hashTime[1] < TreeTime[1]) {
            System.out.println("Время вставки в первый элемент быстрее у HashSet");
        } else {
            if (linkHashTime[1] < TreeTime[1]) {
                System.out.println("Время вставки в первый элемент быстрее у LinkedHashSet");
            } else {
                System.out.println("Время вставки в первый элемент быстрее у TreeSet");
            }
        }

        if (hashTime[2] < linkHashTime[2] && hashTime[2] < TreeTime[2]) {
            System.out.println("Время вставки в центральный элемент быстрее у HashSet");
        } else {
            if (linkHashTime[2] < TreeTime[2]) {
                System.out.println("Время вставки в центральный элемент быстрее у LinkedHashSet");
            } else {
                System.out.println("Время вставки в центральный элемент быстрее у TreeSet");
            }
        }

        if (hashTime[3] < linkHashTime[3] && hashTime[3] < TreeTime[3]) {
            System.out.println("Время вставки в последний элемент быстрее у HashSet");
        } else {
            if (linkHashTime[3] < TreeTime[3]) {
                System.out.println("Время вставки в последний элемент быстрее у LinkedHashSet");
            } else {
                System.out.println("Время вставки в последний элемент быстрее у TreeSet");
            }
        }

        if (hashTime[4] < linkHashTime[4] && hashTime[4] < TreeTime[4]) {
            System.out.println("Время удаления последнего элемента быстрее у HashSet");
        } else {
            if (linkHashTime[4] < TreeTime[4]) {
                System.out.println("Время удаления последнего элемента быстрее у LinkedHashSet");
            } else {
                System.out.println("Время удаления последнего элемента быстрее у TreeSet");
            }
        }

        if (hashTime[5] < linkHashTime[5] && hashTime[5] < TreeTime[5]) {
            System.out.println("Время удаления центрального элемента быстрее у HashSet");
        } else {
            if (linkHashTime[5] < TreeTime[5]) {
                System.out.println("Время удаления центрального элемента быстрее у LinkedHashSet");
            } else {
                System.out.println("Время удаления центрального элемента быстрее у TreeSet");
            }
        }

        if (hashTime[6] < linkHashTime[6] && hashTime[6] < TreeTime[6]) {
            System.out.println("Время удаления первого элемента быстрее у HashSet");
        } else {
            if (linkHashTime[6] < TreeTime[6]) {
                System.out.println("Время удаления первого элемента быстрее у LinkedHashSet");
            } else {
                System.out.println("Время удаления первого элемента быстрее у TreeSet");
            }
        }

        if (hashTime[7] < linkHashTime[7] && hashTime[7] < TreeTime[7]) {
            System.out.println("Время обхода быстрее у HashSet");
        } else {
            if (linkHashTime[7] < TreeTime[7]) {
                System.out.println("Время обхода быстрее у LinkedHashSet");
            } else {
                System.out.println("Время обхода быстрее у TreeSet");
            }
        }
    }

    public static void comparisonList(long[] arrTime, long[] linkTime) {
        if (arrTime[0] < linkTime[0]) {
            System.out.println("Время заполнения коллекции быстрее у ArrayList");
        } else {
            System.out.println("Время заполнения коллекции быстрее у LinkedList");
        }

        if (arrTime[1] < linkTime[1]) {
            System.out.println("Время изменения первого элемента быстрее у ArrayList");
        } else {
            System.out.println("Время изменения первого элемента быстрее у LinkedList");
        }

        if (arrTime[2] < linkTime[2]) {
            System.out.println("Время изменения центрального элемента быстрее у ArrayList");
        } else {
            System.out.println("Время изменения центрального элемента быстрее у LinkedList");
        }

        if (arrTime[3] < linkTime[3]) {
            System.out.println("Время изменения последнего элемента быстрее у ArrayList");
        } else {
            System.out.println("Время изменения последнего элемента быстрее у LinkedList");
        }

        if (arrTime[4] < linkTime[4]) {
            System.out.println("Время доступа к первому элементу быстрее у ArrayList");
        } else {
            System.out.println("Время доступа к первому элементу быстрее у LinkedList");
        }

        if (arrTime[5] < linkTime[5]) {
            System.out.println("Время доступа к центральному элементу быстрее у ArrayList");
        } else {
            System.out.println("Время доступа к центральному элементу быстрее у LinkedList");
        }

        if (arrTime[6] < linkTime[6]) {
            System.out.println("Время доступа к последнему элементу быстрее у ArrayList");
        } else {
            System.out.println("Время доступа к последнему элементу быстрее у LinkedList");
        }

        if (arrTime[7] < linkTime[7]) {
            System.out.println("Время добавления элемента в конец быстрее у ArrayList");
        } else {
            System.out.println("Время добавления элемента в конец быстрее у LinkedList");
        }

        if (arrTime[8] < linkTime[8]) {
            System.out.println("Время добавления элемента в начало быстрее у ArrayList");
        } else {
            System.out.println("Время добавления элемента в начало быстрее у LinkedList");
        }

        if (arrTime[9] < linkTime[9]) {
            System.out.println("Время добавления элемента в центр быстрее у ArrayList");
        } else {
            System.out.println("Время добавления элемента в центр быстрее у LinkedList");
        }

        if (arrTime[10] < linkTime[10]) {
            System.out.println("Время удаления первого элемента быстрее у ArrayList");
        } else {
            System.out.println("Время удаления первого элемента быстрее у LinkedList");
        }

        if (arrTime[11] < linkTime[11]) {
            System.out.println("Время удаления центрального элемента быстрее у ArrayList");
        } else {
            System.out.println("Время удаления центрального элемента быстрее у LinkedList");
        }

        if (arrTime[12] < linkTime[12]) {
            System.out.println("Время удаления последнего элемента быстрее у ArrayList");
        } else {
            System.out.println("Время удаления последнего элемента быстрее у LinkedList");
        }
    }

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

                    long[] arrTime = new long[13];
                    long[] linkTime = new long[13];

                    List<Integer> arrayList = new ArrayList<>();
                    List<Integer> linkedList = new LinkedList<>();

                    //////////////////////////////ArrayList/////////////////////////////////////
                    //////////////////////////////ЗАПОЛНЕНИЕ////////////////////////////////////
                    System.out.println("ArrayList: ");
                    arrTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(i);
                    }
                    arrTime[0] = System.nanoTime() - arrTime[0];
                    System.out.println("Время заполнения коллекции: " + arrTime[0] + " нс");


                    /////////////////////////////ИЗМЕНЕНИЕ/////////////////////////////////////
                    arrTime[1] = System.nanoTime();
                    arrayList.set(0, size);
                    arrTime[1] = System.nanoTime() - arrTime[1];
                    System.out.println("Время изменения первого элемента: " + arrTime[1] + " нс");

                    arrTime[2] = System.nanoTime();
                    arrayList.set(size / 2, size);
                    arrTime[2] = System.nanoTime() - arrTime[2];
                    System.out.println("Время изменения центрального элемента: " + arrTime[2] + " нс");

                    arrTime[3] = System.nanoTime();
                    arrayList.set(size - 1, size);
                    arrTime[3] = System.nanoTime() - arrTime[3];
                    System.out.println("Время изменения последнего элемента: " + arrTime[3] + " нс");

                    ////////////////////////////////ДОСТУП/////////////////////////////////////////////////
                    arrTime[4] = System.nanoTime();
                    arrayList.get(0);
                    arrTime[4] = System.nanoTime() - arrTime[4];
                    System.out.println("Время доступа к первому элементу: " + arrTime[4] + " нс");

                    arrTime[5] = System.nanoTime();
                    arrayList.get(size / 2);
                    arrTime[5] = System.nanoTime() - arrTime[5];
                    System.out.println("Время доступа к центральному элементу: " + arrTime[5] + " нс");

                    arrTime[6] = System.nanoTime();
                    arrayList.get(size - 1);
                    arrTime[6] = System.nanoTime() - arrTime[6];
                    System.out.println("Время доступа к последнему элементу: " + arrTime[6] + " нс");

                    //////////////////////////////////ДОБАВЛЕНИЕ///////////////////////////////////////////////
                    arrTime[7] = System.nanoTime();
                    arrayList.add(size, size);
                    arrTime[7] = System.nanoTime() - arrTime[7];
                    System.out.println("Время добавления элемента в конец: " + arrTime[7] + " нс");

                    arrTime[8] = System.nanoTime();
                    arrayList.add(0, size);
                    arrTime[8] = System.nanoTime() - arrTime[8];
                    System.out.println("Время добавления элемента в начало: " + arrTime[8] + " нс");

                    arrTime[9] = System.nanoTime();
                    arrayList.add(size / 2, size);
                    arrTime[9] = System.nanoTime() - arrTime[9];
                    System.out.println("Время добавления элемента в центр: " + arrTime[9] + " нс");

                    //////////////////////////////////УДАЛЕНИЕ///////////////////////////////////////////////
                    arrTime[10] = System.nanoTime();
                    arrayList.remove(0);
                    arrTime[10] = System.nanoTime() - arrTime[10];
                    System.out.println("Время удаления первого элемента: " + arrTime[10] + " нс");

                    arrTime[11] = System.nanoTime();
                    arrayList.remove(size / 2);
                    arrTime[11] = System.nanoTime() - arrTime[11];
                    System.out.println("Время удаления центрального элемента: " + arrTime[11] + " нс");

                    arrTime[12] = System.nanoTime();
                    arrayList.remove(size);
                    arrTime[12] = System.nanoTime() - arrTime[12];
                    System.out.println("Время удаления последнего элемента: " + arrTime[12] + " нс");
                    System.out.println();

                    //////////////////////////////LinkedList/////////////////////////////////////
                    //////////////////////////////ЗАПОЛНЕНИЕ////////////////////////////////////
                    System.out.println("LinkedList: ");
                    linkTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        linkedList.add(i);
                    }
                    linkTime[0] = System.nanoTime() - linkTime[0];
                    System.out.println("Время заполнения коллекции: " + linkTime[0] + " нс");
                    //////////////////////////////ИЗМЕНЕНИЕ///////////////////////////////////////
                    linkTime[1] = System.nanoTime();
                    linkedList.set(0, size);
                    linkTime[1] = System.nanoTime() - linkTime[1];
                    System.out.println("Время изменения первого элемента: " + linkTime[1] + " нс");

                    linkTime[2] = System.nanoTime();
                    linkedList.set(size / 2, size);
                    linkTime[2] = System.nanoTime() - linkTime[2];
                    System.out.println("Время изменения центрального элемента: " + linkTime[2] + " нс");

                    linkTime[3] = System.nanoTime();
                    linkedList.set(size - 1, size);
                    linkTime[3] = System.nanoTime() - linkTime[3];
                    System.out.println("Время изменения последнего элемента: " + linkTime[3] + " нс");
                    ///////////////////////////////////ДОСТУП//////////////////////////////////////
                    linkTime[4] = System.nanoTime();
                    linkedList.get(0);
                    linkTime[4] = System.nanoTime() - linkTime[4];
                    System.out.println("Время доступа к первому элементу: " + linkTime[4] + " нс");

                    linkTime[5] = System.nanoTime();
                    linkedList.get(size / 2);
                    linkTime[5] = System.nanoTime() - linkTime[5];
                    System.out.println("Время доступа к центральному элементу: " + linkTime[5] + " нс");

                    linkTime[6] = System.nanoTime();
                    linkedList.get(size - 1);
                    linkTime[6] = System.nanoTime() - linkTime[6];
                    System.out.println("Время доступа к последнему элементу: " + linkTime[6] + " нс");
                    //////////////////////////////////ДОБАВЛЕНИЕ////////////////////////////////////////
                    linkTime[7] = System.nanoTime();
                    linkedList.add(size, size);
                    linkTime[7] = System.nanoTime() - linkTime[7];
                    System.out.println("Время добавления элемента в конец: " + linkTime[7] + " нс");

                    linkTime[8] = System.nanoTime();
                    linkedList.add(0, size);
                    linkTime[8] = System.nanoTime() - linkTime[8];
                    System.out.println("Время добавления элемента в начало: " + linkTime[8] + " нс");

                    linkTime[9] = System.nanoTime();
                    linkedList.add(size / 2, size);
                    linkTime[9] = System.nanoTime() - linkTime[9];
                    System.out.println("Время добавления элемента в центр: " + linkTime[9] + " нс");
                    ////////////////////////////////////УДАЛЕНИЕ///////////////////////////////////
                    linkTime[10] = System.nanoTime();
                    linkedList.remove(0);
                    linkTime[10] = System.nanoTime() - linkTime[10];
                    System.out.println("Время удаления первого элемента: " + linkTime[10] + " нс");

                    linkTime[11] = System.nanoTime();
                    linkedList.remove(size / 2);
                    linkTime[11] = System.nanoTime() - linkTime[11];
                    System.out.println("Время удаления центрального элемента: " + linkTime[11] + " нс");

                    linkTime[12] = System.nanoTime();
                    linkedList.remove(size);
                    linkTime[12] = System.nanoTime() - linkTime[12];
                    System.out.println("Время удаления последнего элемента: " + linkTime[12] + " нс");
                    System.out.println();

                    ///////////////////////СРАВНЕНИЕ////////////////////////////
                    comparisonList(arrTime, linkTime);

                    break;

                case 2:
                    long[] hashTime = new long[8];
                    long[] linkHashTime = new long[8];
                    long[] TreeTime = new long[8];

                    Set<Integer> hashSet = new HashSet<>();
                    Set<Integer> linkedHashSet = new LinkedHashSet<>();
                    Set<Integer> treeSet = new TreeSet<>();

                    ////////////////////HashSet///////////////////////
                    ////////////////////ЗАПОЛНЕНИЕ////////////////////
                    System.out.println("HashSet: ");
                    hashTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        hashSet.add(i);
                    }
                    hashTime[0] = System.nanoTime() - hashTime[0];
                    System.out.println("Время заполнения коллекции: " + hashTime[0] + " нс");

                    /////////////////////////////ВСТАВКА//////////////////////////////////
                    hashTime[1] = System.nanoTime();
                    hashSet.add(0);
                    hashTime[1] = System.nanoTime() - hashTime[1];
                    System.out.println("Время вставки в первый элемент: " + hashTime[1] + " нс");

                    hashTime[2] = System.nanoTime();
                    hashSet.add(size / 2);
                    hashTime[2] = System.nanoTime() - hashTime[2];
                    System.out.println("Время вставки в центральный элемент: " + hashTime[2] + " нс");

                    hashTime[3] = System.nanoTime();
                    hashSet.add(size - 1);
                    hashTime[3] = System.nanoTime() - hashTime[3];
                    System.out.println("Время вставки в последний элемент: " + hashTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    hashTime[4] = System.nanoTime();
                    hashSet.remove(size - 1);
                    hashTime[4] = System.nanoTime() - hashTime[4];
                    System.out.println("Время удаления последнего элемента: " + hashTime[4] + " нс");

                    hashTime[5] = System.nanoTime();
                    hashSet.remove(size / 2);
                    hashTime[5] = System.nanoTime() - hashTime[5];
                    System.out.println("Время удаления центрального элемента: " + hashTime[5] + " нс");

                    hashTime[6] = System.nanoTime();
                    hashSet.remove(0);
                    hashTime[6] = System.nanoTime() - hashTime[6];
                    System.out.println("Время удаления первого элемента: " + hashTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    hashTime[7] = System.nanoTime();
                    Iterator<Integer> iterator1 = hashSet.iterator();
                    while (iterator1.hasNext()) {
                        //что нибудь
                        iterator1.next();
                    }
                    hashTime[7] = System.nanoTime() - hashTime[7];
                    System.out.println("Время обхода: " + hashTime[7] + " нс");
                    System.out.println();


                    //////////////////////////////LinkedHashSet//////////////////////////////////////
                    ///////////////////////////////ЗАПОЛНЕНИЕ//////////////////////////////////
                    System.out.println("LinkedHashSet: ");
                    linkHashTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        linkedHashSet.add(i);
                    }
                    linkHashTime[0] = System.nanoTime() - linkHashTime[0];
                    System.out.println("Время заполнения коллекции: " + linkHashTime[0] + " нс");

                    /////////////////////////////ВСТАВКА//////////////////////////////////
                    linkHashTime[1] = System.nanoTime();
                    linkedHashSet.add(0);
                    linkHashTime[1] = System.nanoTime() - linkHashTime[1];
                    System.out.println("Время вставки в первый элемент: " + linkHashTime[1] + " нс");

                    linkHashTime[2] = System.nanoTime();
                    linkedHashSet.add(size / 2);
                    linkHashTime[2] = System.nanoTime() - linkHashTime[2];
                    System.out.println("Время вставки в центральный элемент: " + linkHashTime[2] + " нс");

                    linkHashTime[3] = System.nanoTime();
                    linkedHashSet.add(size - 1);
                    linkHashTime[3] = System.nanoTime() - linkHashTime[3];
                    System.out.println("Время вставки в последний элемент: " + linkHashTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    linkHashTime[4] = System.nanoTime();
                    linkedHashSet.remove(size - 1);
                    linkHashTime[4] = System.nanoTime() - linkHashTime[4];
                    System.out.println("Время удаления последнего элемента: " + linkHashTime[4] + " нс");

                    linkHashTime[5] = System.nanoTime();
                    linkedHashSet.remove(size / 2);
                    linkHashTime[5] = System.nanoTime() - linkHashTime[5];
                    System.out.println("Время удаления центрального элемента: " + linkHashTime[5] + " нс");

                    linkHashTime[6] = System.nanoTime();
                    linkedHashSet.remove(0);
                    linkHashTime[6] = System.nanoTime() - linkHashTime[6];
                    System.out.println("Время удаления первого элемента: " + linkHashTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    linkHashTime[7] = System.nanoTime();
                    Iterator<Integer> iterator2 = linkedHashSet.iterator();
                    while (iterator2.hasNext()) {
                        //что нибудь
                        iterator2.next();
                    }
                    linkHashTime[7] = System.nanoTime() - linkHashTime[7];
                    System.out.println("Время обхода: " + linkHashTime[7] + " нс");
                    System.out.println();


                    ////////////////////////////TreeSet////////////////////////////////
                    ///////////////////////ЗАПОЛНЕНИЕ//////////////////////////////////
                    System.out.println("TreeSet: ");
                    TreeTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        treeSet.add(i);
                    }
                    TreeTime[0] = System.nanoTime() - TreeTime[0];
                    System.out.println("Время заполнения коллекции: " + TreeTime[0] + " нс");

                    /////////////////////////////ВСТАВКА//////////////////////////////////
                    TreeTime[1] = System.nanoTime();
                    treeSet.add(0);
                    TreeTime[1] = System.nanoTime() - TreeTime[1];
                    System.out.println("Время вставки в первый элемент: " + TreeTime[1] + " нс");

                    TreeTime[2] = System.nanoTime();
                    treeSet.add(size / 2);
                    TreeTime[2] = System.nanoTime() - TreeTime[2];
                    System.out.println("Время вставки в центральный элемент: " + TreeTime[2] + " нс");

                    TreeTime[3] = System.nanoTime();
                    treeSet.add(size - 1);
                    TreeTime[3] = System.nanoTime() - TreeTime[3];
                    System.out.println("Время вставки в последний элемент: " + TreeTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    TreeTime[4] = System.nanoTime();
                    treeSet.remove(size - 1);
                    TreeTime[4] = System.nanoTime() - TreeTime[4];
                    System.out.println("Время удаления последнего элемента: " + TreeTime[4] + " нс");

                    TreeTime[5] = System.nanoTime();
                    treeSet.remove(size / 2);
                    TreeTime[5] = System.nanoTime() - TreeTime[5];
                    System.out.println("Время удаления центрального элемента: " + TreeTime[5] + " нс");

                    TreeTime[6] = System.nanoTime();
                    treeSet.remove(0);
                    TreeTime[6] = System.nanoTime() - TreeTime[6];
                    System.out.println("Время удаления первого элемента: " + TreeTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    TreeTime[7] = System.nanoTime();
                    Iterator<Integer> iterator3 = treeSet.iterator();
                    while (iterator3.hasNext()) {
                        //что нибудь
                        iterator3.next();
                    }
                    TreeTime[7] = System.nanoTime() - TreeTime[7];
                    System.out.println("Время обхода: " + TreeTime[7] + " нс");
                    System.out.println();

                    ///////////////////////СРАВНЕНИЕ////////////////////////////
                    comparisonHash(hashTime, linkHashTime, TreeTime);

                    break;

                case 3:
                    long[] hashMapTime = new long[8];
                    long[] linkedHashMapTime = new long[8];
                    long[] treeMapTime = new long[8];

                    Map<Integer, Integer> hashMap = new HashMap<>();
                    Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
                    Map<Integer, Integer> treeMap = new TreeMap<>();


                    ////////////////////HashMap///////////////////////
                    ////////////////////ЗАПОЛНЕНИЕ////////////////////
                    System.out.println("HashSet: ");
                    hashMapTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        hashMap.put(i, i);
                    }
                    hashMapTime[0] = System.nanoTime() - hashMapTime[0];
                    System.out.println("Время заполнения коллекции: " + hashMapTime[0] + " нс");

                    ///////////////////////ВСТАВКА//////////////////////////////////////
                    hashMapTime[1] = System.nanoTime();
                    hashMap.put(size - 1, size);
                    hashMapTime[1] = System.nanoTime() - hashMapTime[1];
                    System.out.println("Время вставки в последний элемент: " + hashMapTime[1] + " нс");

                    hashMapTime[2] = System.nanoTime();
                    hashMap.put(0, size);
                    hashMapTime[2] = System.nanoTime() - hashMapTime[2];
                    System.out.println("Время вставки в первый элемент: " + hashMapTime[2] + " нс");

                    hashMapTime[3] = System.nanoTime();
                    hashMap.put(size / 2, size);
                    hashMapTime[3] = System.nanoTime() - hashMapTime[3];
                    System.out.println("Время вставки в центральный элемент: " + hashMapTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    hashMapTime[4] = System.nanoTime();
                    hashMap.remove(size - 1);
                    hashMapTime[4] = System.nanoTime() - hashMapTime[4];
                    System.out.println("Время удаления последнего элемента: " + hashMapTime[4] + " нс");

                    hashMapTime[5] = System.nanoTime();
                    hashMap.remove(size / 2);
                    hashMapTime[5] = System.nanoTime() - hashMapTime[5];
                    System.out.println("Время удаления центрального элемента: " + hashMapTime[5] + " нс");

                    hashMapTime[6] = System.nanoTime();
                    hashMap.remove(0);
                    hashMapTime[6] = System.nanoTime() - hashMapTime[6];
                    System.out.println("Время удаления первого элемента: " + hashMapTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    hashMapTime[7] = System.nanoTime();
                    Iterator<Map.Entry<Integer, Integer>> iterator4 = hashMap.entrySet().iterator();
                    while (iterator4.hasNext()) {
                        //что нибудь
                        iterator4.next();
                    }
                    hashMapTime[7] = System.nanoTime() - hashMapTime[7];
                    System.out.println("Время обхода: " + hashMapTime[7] + " нс");
                    System.out.println();


                    ////////////////////LinkedHashMap///////////////////////
                    ////////////////////ЗАПОЛНЕНИЕ////////////////////
                    System.out.println("LinkedHashMap: ");
                    linkedHashMapTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        linkedHashMap.put(i, i);
                    }
                    linkedHashMapTime[0] = System.nanoTime() - linkedHashMapTime[0];
                    System.out.println("Время заполнения коллекции: " + linkedHashMapTime[0] + " нс");

                    ///////////////////////ВСТАВКА//////////////////////////////////////
                    linkedHashMapTime[1] = System.nanoTime();
                    linkedHashMap.put(size - 1, size);
                    linkedHashMapTime[1] = System.nanoTime() - linkedHashMapTime[1];
                    System.out.println("Время вставки в последний элемент: " + linkedHashMapTime[1] + " нс");

                    linkedHashMapTime[2] = System.nanoTime();
                    linkedHashMap.put(0, size);
                    linkedHashMapTime[2] = System.nanoTime() - linkedHashMapTime[2];
                    System.out.println("Время вставки в первый элемент: " + linkedHashMapTime[2] + " нс");

                    linkedHashMapTime[3] = System.nanoTime();
                    linkedHashMap.put(size / 2, size);
                    linkedHashMapTime[3] = System.nanoTime() - linkedHashMapTime[3];
                    System.out.println("Время вставки в центральный элемент: " + linkedHashMapTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    linkedHashMapTime[4] = System.nanoTime();
                    linkedHashMap.remove(size - 1);
                    linkedHashMapTime[4] = System.nanoTime() - linkedHashMapTime[4];
                    System.out.println("Время удаления последнего элемента: " + linkedHashMapTime[4] + " нс");

                    linkedHashMapTime[5] = System.nanoTime();
                    linkedHashMap.remove(size / 2);
                    linkedHashMapTime[5] = System.nanoTime() - linkedHashMapTime[5];
                    System.out.println("Время удаления центрального элемента: " + linkedHashMapTime[5] + " нс");

                    linkedHashMapTime[6] = System.nanoTime();
                    linkedHashMap.remove(0);
                    linkedHashMapTime[6] = System.nanoTime() - linkedHashMapTime[6];
                    System.out.println("Время удаления первого элемента: " + linkedHashMapTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    linkedHashMapTime[7] = System.nanoTime();
                    Iterator<Map.Entry<Integer, Integer>> iterator5 = linkedHashMap.entrySet().iterator();
                    while (iterator5.hasNext()) {
                        //что нибудь
                        iterator5.next();
                    }
                    linkedHashMapTime[7] = System.nanoTime() - linkedHashMapTime[7];
                    System.out.println("Время обхода: " + linkedHashMapTime[7] + " нс");
                    System.out.println();


                    ////////////////////TreeMap///////////////////////
                    ////////////////////ЗАПОЛНЕНИЕ////////////////////
                    System.out.println("TreeMap: ");
                    treeMapTime[0] = System.nanoTime();
                    for (int i = 0; i < size; i++) {
                        treeMap.put(i, i);
                    }
                    treeMapTime[0] = System.nanoTime() - treeMapTime[0];
                    System.out.println("Время заполнения коллекции: " + treeMapTime[0] + " нс");

                    ///////////////////////ВСТАВКА//////////////////////////////////////
                    treeMapTime[1] = System.nanoTime();
                    treeMap.put(size - 1, size);
                    treeMapTime[1] = System.nanoTime() - treeMapTime[1];
                    System.out.println("Время вставки в последний элемент: " + treeMapTime[1] + " нс");

                    treeMapTime[2] = System.nanoTime();
                    treeMap.put(0, size);
                    treeMapTime[2] = System.nanoTime() - treeMapTime[2];
                    System.out.println("Время вставки в первый элемент: " + treeMapTime[2] + " нс");

                    treeMapTime[3] = System.nanoTime();
                    treeMap.put(size / 2, size);
                    treeMapTime[3] = System.nanoTime() - treeMapTime[3];
                    System.out.println("Время вставки в центральный элемент: " + treeMapTime[3] + " нс");

                    ///////////////////////УДАЛЕНИЕ//////////////////////////////
                    treeMapTime[4] = System.nanoTime();
                    treeMap.remove(size - 1);
                    treeMapTime[4] = System.nanoTime() - treeMapTime[4];
                    System.out.println("Время удаления последнего элемента: " + treeMapTime[4] + " нс");

                    treeMapTime[5] = System.nanoTime();
                    treeMap.remove(size / 2);
                    treeMapTime[5] = System.nanoTime() - treeMapTime[5];
                    System.out.println("Время удаления центрального элемента: " + treeMapTime[5] + " нс");

                    treeMapTime[6] = System.nanoTime();
                    treeMap.remove(0);
                    treeMapTime[6] = System.nanoTime() - treeMapTime[6];
                    System.out.println("Время удаления первого элемента: " + treeMapTime[6] + " нс");

                    ////////////////////////ОБХОД//////////////////////////////////
                    treeMapTime[7] = System.nanoTime();
                    Iterator<Map.Entry<Integer, Integer>> iterator6 = treeMap.entrySet().iterator();
                    while (iterator6.hasNext()) {
                        //что нибудь
                        iterator6.next();
                    }
                    treeMapTime[7] = System.nanoTime() - treeMapTime[7];
                    System.out.println("Время обхода: " + treeMapTime[7] + " нс");
                    System.out.println();

                    /////////////////////////СРАВНЕНИЕ///////////////////////////
                    comparisonMap(hashMapTime, linkedHashMapTime, treeMapTime);

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
