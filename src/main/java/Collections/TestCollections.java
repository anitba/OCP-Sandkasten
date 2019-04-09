package Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class TestCollections {

    @Test
    public void testCollection() {
        Collection<String> collection = new ArrayList(Arrays.asList("apple", "banana", "orange"));
        
        assertFalse(collection.isEmpty());
        assertEquals(collection.size(), 3);
        assertTrue(collection.add("pineapple"));
        assertTrue(collection.addAll(Arrays.asList("strawberry", "lemon")));
        
        assertTrue(collection.remove("pineapple"));
        assertTrue(collection.removeAll(Arrays.asList("lemon", "pineapple")));
        assertFalse(collection.removeIf(entry -> entry.equalsIgnoreCase("pear")));
        
        assertTrue(collection.contains("apple"));
        assertTrue(collection.containsAll(Arrays.asList("apple", "orange")));
        
        assertTrue(collection.retainAll(Arrays.asList("apple", "orange")));
        
        Object[] array = collection.toArray();
        
        String[] stringArray = new String[]{};
        String[] toStringArray = collection.toArray(stringArray);
        
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            assertTrue(iterator.next() instanceof String);
        }
    }
}
