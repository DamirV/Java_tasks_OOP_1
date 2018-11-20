package myLinkedListClass;

import java.util.Iterator;

public class MyLinkedList<T> implements ILinkedList<T> {

    private int size;
    Node<T> head;
    Node<T> tail;

    MyLinkedList() {
        tail = head = null;
        size = 0;
    }

    @Override
    public void add(T element) {
        Node<T> temp = new Node(element, null);

        if (size == 0) {
            tail = head = temp;
            size++;
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index = " + index);


        if (index == size) {
            add(element);
        } else {
            if (index == 0) {
                Node<T> tempNode = new Node<>(element, head);
                head = tempNode;
                size++;

            } else {
                Node<T> currNode = head;
                Node<T> prevNode = head;

                for (int i = 0; i < index; i++) {
                    prevNode = currNode;
                    currNode = currNode.next;
                }

                Node<T> tempNode = new Node<>(element, currNode);
                prevNode.next = tempNode;
                size++;
            }
        }
    }

    @Override
    public void clear() {
        tail = head = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index = " + index);

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    @Override
    public T remove(int index) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index = " + index);

        if (index == 0) {
            T temp = head.element;
            head = head.next;
            size--;
            return temp;

        } else {
                Node<T> currNode = head;
                Node<T> prevNode = head;

                for (int i = 0; i < index; i++) {
                    prevNode = currNode;
                    currNode = currNode.next;
                }

                prevNode.next = currNode.next;
                currNode.next = null;

                if(index == size - 1){
                    tail = prevNode;
                }
                size--;
                return currNode.element;

        }
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 && index > size)
            throw new IndexOutOfBoundsException("index = " + index);

        if (index == size - 1) {
            T temp = tail.element;
            tail.element = element;
            return temp;
        } else {
            if (index == 0) {
                T temp = head.element;
                head.element = element;
                return temp;

            } else {
                Node<T> currNode = head;

                for (int i = 0; i < index; i++) {
                    currNode = currNode.next;
                }
                T temp = currNode.element;
                currNode.element = element;
                return temp;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] o = new Object[size];
        Node<T> curr = head;
        for (int i = 0; i < size; i++) {
            o[i] = curr.element;
            curr = curr.next;
        }
        return o;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        String str = "";

        if (current == null) {
            return null;
        }

        while (current != null) {
            str += current.element + " ";
            current = current.next;
        }
        return str;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;
            private int num = 0;

            @Override
            public boolean hasNext() {
                return num < size;
            }

            @Override
            public T next() {

                T res = current.element;
                if (hasNext()){
                    current = current.next;
                    num++;
                }

                return res;
            }
        };
    }

}


