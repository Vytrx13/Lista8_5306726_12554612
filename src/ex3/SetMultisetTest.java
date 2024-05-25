package ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class SetMultisetTest {
    @Test
    public void testAdd() {
        SetMultiset<String> multiset = new SetMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        assertEquals("[banana, apple]", multiset.toString());
    }

    @Test
    public void testEquals() {
        SetMultiset<String> multiset1 = new SetMultiset<>();
        multiset1.add("apple");
        multiset1.add("banana");

        SetMultiset<String> multiset2 = new SetMultiset<>();
        multiset2.add("apple");
        multiset2.add("banana");

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        SetMultiset<String> multiset1 = new SetMultiset<>();
        multiset1.add("apple");

        SetMultiset<String> multiset2 = new SetMultiset<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);
        assertEquals("[banana, apple, cherry]", multiset1.toString());
    }
}

