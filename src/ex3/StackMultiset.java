package ex3;

import java.util.Stack;

public class StackMultiset<T> {
    private Stack<T> elements;

    public StackMultiset() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(StackMultiset<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(StackMultiset<T> other) {
        this.elements.addAll(other.elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

