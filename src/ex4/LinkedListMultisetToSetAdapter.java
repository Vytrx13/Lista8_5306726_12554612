import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedListMultisetToSetAdapter<T> implements Iterable<T> {
    private Set<T> set;

    public LinkedListMultisetToSetAdapter(LinkedListMultiset<T> multiset) {
        this.set = new HashSet<>(multiset.getElements());
    }

    public boolean add(T element) {
        return set.add(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public boolean remove(T element) {
        return set.remove(element);
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}

// so fiz para um porque o resto é tudo igual, e o enunciado n especificou qual era para fazer
*/