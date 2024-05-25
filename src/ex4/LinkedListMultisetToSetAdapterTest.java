import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListMultisetToSetAdapterTest {
    @Test
    public void testAdd() {
        LinkedListMultiset<String> multiset = new LinkedListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        multiset.add("apple"); // duplicate

        LinkedListMultisetToSetAdapter<String> adapter = new LinkedListMultisetToSetAdapter<>(multiset);
        assertEquals("[apple, banana]", adapter.toString());
    }

    @Test
    public void testContains() {
        LinkedListMultiset<String> multiset = new LinkedListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");

        LinkedListMultisetToSetAdapter<String> adapter = new LinkedListMultisetToSetAdapter<>(multiset);
        assertTrue(adapter.contains("apple"));
        assertFalse(adapter.contains("cherry"));
    }

    @Test
    public void testRemove() {
        LinkedListMultiset<String> multiset = new LinkedListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");

        LinkedListMultisetToSetAdapter<String> adapter = new LinkedListMultisetToSetAdapter<>(multiset);
        adapter.remove("apple");
        assertFalse(adapter.contains("apple"));
        assertTrue(adapter.contains("banana"));
    }

    @Test
    public void testIterator() {
        LinkedListMultiset<String> multiset = new LinkedListMultiset<>();
        multiset.add("apple");
        multiset.add("banana");
        multiset.add("apple"); // duplicate

        LinkedListMultisetToSetAdapter<String> adapter = new LinkedListMultisetToSetAdapter<>(multiset);
        Iterator<String> iterator = adapter.iterator();
        
        Set<String> resultSet = new HashSet<>();
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }

        assertEquals(2, resultSet.size());
        assertTrue(resultSet.contains("apple"));
        assertTrue(resultSet.contains("banana"));
    }
}
