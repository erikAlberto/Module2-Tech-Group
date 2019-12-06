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
        myLinkedList.add("sunday");
        myLinkedList.add("saturday");
        myLinkedList.add("monday");
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testGetMethod() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("sunday");
        myLinkedList.add("saturday");
        myLinkedList.add("monday");

        assertEquals("monday", myLinkedList.get(2));
        assertEquals("sunday", myLinkedList.get(0));
        assertEquals("saturday", myLinkedList.get(1));
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
        myLinkedList.add("hey");
        myLinkedList.add("hello");
        assertTrue(myLinkedList.contains("hello"));
    }

    @Test
    public void testRemove() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("hi");
        myLinkedList.add("hello");
        myLinkedList.add("ello");
        assertTrue(myLinkedList.remove("hello"));
    }
}
