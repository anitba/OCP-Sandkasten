package Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollections {

    @Test
    public void testCollection() {
        Collection<String> collection = new ArrayList(Arrays.asList("apple", "banana", "orange"));
        assertEquals(collection.size(), 3);
    }
}
