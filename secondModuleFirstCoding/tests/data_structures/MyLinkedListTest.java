package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void testAddNode () {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("sdsdf");
        myLinkedList.add("dsdf");
        myLinkedList.add("hello");
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testIsEmptyList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void testContainsValue() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("hi");
        myLinkedList.add("ello");
        myLinkedList.add("hello");
        assertTrue(myLinkedList.contains("hello"));
    }
}
