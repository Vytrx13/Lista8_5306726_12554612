package ex3;

import java.util.HashSet;
import java.util.Set;

public class SetMultiset<T> {
    private Set<T> elements;

    public SetMultiset() {
        this.elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(SetMultiset<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(SetMultiset<T> other) {
        this.elements.addAll(other.elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

