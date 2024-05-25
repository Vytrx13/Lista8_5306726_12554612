package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListMultisetTest {
    @Test
    public void testAdd() {
        LinkedListMultiset<String> multiset = new LinkedListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        assertEquals("[apple, banana]", multiset.toString());
    }

    @Test
    public void testEquals() {
        LinkedListMultiset<String> multiset1 = new LinkedListMultiset<>();
        multiset1.add("apple");
        multiset1.add("banana");

        LinkedListMultiset<String> multiset2 = new LinkedListMultiset<>();
        multiset2.add("apple");
        multiset2.add("banana");

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        LinkedListMultiset<String> multiset1 = new LinkedListMultiset<>();
        multiset1.add("apple");

        LinkedListMultiset<String> multiset2 = new LinkedListMultiset<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);
        assertEquals("[apple, banana, cherry]", multiset1.toString());
    }
}

