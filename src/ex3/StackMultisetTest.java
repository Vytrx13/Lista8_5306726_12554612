package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackMultisetTest {
    @Test
    public void testAdd() {
        StackMultiset<String> multiset = new StackMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        assertEquals("[apple, banana]", multiset.toString());
    }

    @Test
    public void testEquals() {
        StackMultiset<String> multiset1 = new StackMultiset<>();
        multiset1.add("apple");
        multiset1.add("banana");

        StackMultiset<String> multiset2 = new StackMultiset<>();
        multiset2.add("apple");
        multiset2.add("banana");

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        StackMultiset<String> multiset1 = new StackMultiset<>();
        multiset1.add("apple");

        StackMultiset<String> multiset2 = new StackMultiset<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);
        assertEquals("[apple, banana, cherry]", multiset1.toString());
    }
}


