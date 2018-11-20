package myLinkedListClass;

public class Node<T> {
    public T element;
    public Node<T> next;

    Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}
