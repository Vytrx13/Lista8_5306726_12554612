package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayListMultisetTest {
    @Test
    public void testAdd() {
        ArrayListMultiset<String> multiset = new ArrayListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        assertEquals("[apple, banana]", multiset.toString());
    }

    @Test
    public void testEquals() {
        ArrayListMultiset<String> multiset1 = new ArrayListMultiset<>();
        multiset1.add("apple");
        multiset1.add("banana");

        ArrayListMultiset<String> multiset2 = new ArrayListMultiset<>();
        multiset2.add("apple");
        multiset2.add("banana");

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        ArrayListMultiset<String> multiset1 = new ArrayListMultiset<>();
        multiset1.add("apple");

        ArrayListMultiset<String> multiset2 = new ArrayListMultiset<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);
        assertEquals("[apple, banana, cherry]", multiset1.toString());
    }
}

