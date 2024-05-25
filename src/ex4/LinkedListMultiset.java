package ex3;

import java.util.LinkedList;

public class LinkedListMultiset<T> {
    private LinkedList<T> elements;

    public LinkedListMultiset() {
        this.elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(LinkedListMultiset<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(LinkedListMultiset<T> other) {
        this.elements.addAll(other.elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
