package ex3;

import java.util.ArrayList;


public class ArrayListMultiset<T> {
    private ArrayList<T> elements;

    public ArrayListMultiset() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(ArrayListMultiset<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(ArrayListMultiset<T> other) {
        this.elements.addAll(other.elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

