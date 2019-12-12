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
    public void testToString() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("world");
        myLinkedList.add("hello");
        myLinkedList.add("gat");
        assertEquals("[world, hello, gat]", myLinkedList.toString());
    }

    @Test
    public void testGetMethodShouldReturnTheValueOfTheNodeOnTheSpecifiedIndex() {
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
    public void testContainsShouldReturnTrueIfExists() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("world");
        myLinkedList.add("people");
        myLinkedList.add("hello");

        assertFalse(myLinkedList.contains("hola"));
        assertTrue(myLinkedList.contains("people"));
    }

    /*@Test
    public void testRemove() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("hi");
        myLinkedList.add("hello");
        myLinkedList.add("ello");
        myLinkedList.add("hi");

        assertTrue(myLinkedList.remove("hi"));
        assertEquals(2, myLinkedList.size());
    }*/

    @Test
    public void testClearLinkedList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("world");
        myLinkedList.add("people");
        myLinkedList.add("hello");

        assertEquals(3, myLinkedList.size());
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void testRemoveElementInTheMiddleOfTheList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");
        myLinkedList.add("hello");
        myLinkedList.add("world");

        assertEquals(3, myLinkedList.size());
        assertEquals("hello", myLinkedList.get(1));

        assertTrue(myLinkedList.remove("hello"));

        assertEquals(2, myLinkedList.size());
        assertEquals("world", myLinkedList.get(1));
    }

    @Test
    public void testRemoveFirstElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");
        myLinkedList.add("hello");
        myLinkedList.add("world");

        assertEquals(3, myLinkedList.size());
        assertEquals("people", myLinkedList.get(0));
        assertEquals("people", myLinkedList.getFirst().getValue());

        assertTrue(myLinkedList.remove("people"));

        assertEquals(2, myLinkedList.size());
        assertEquals("hello", myLinkedList.get(0));
        assertEquals("hello", myLinkedList.getFirst().getValue());
    }

    @Test
    public void testRemoveLastElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");
        myLinkedList.add("hello");
        myLinkedList.add("world");

        assertEquals(3, myLinkedList.size());
        assertEquals("world", myLinkedList.get(2));
        assertEquals("world", myLinkedList.getLast().getValue());

        assertTrue(myLinkedList.remove("world"));

        assertEquals(2, myLinkedList.size());
        assertEquals("hello", myLinkedList.getLast().getValue());
    }

    @Test
    public void testRemoveNonExistentElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");
        myLinkedList.add("hello");
        myLinkedList.add("world");

        assertEquals(3, myLinkedList.size());

        assertFalse(myLinkedList.remove("worlds"));

        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testRemoveTheOnlyElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");

        assertEquals(1, myLinkedList.size());

        assertTrue(myLinkedList.remove("people"));

        assertEquals(0, myLinkedList.size());
        assertNull(myLinkedList.getFirst());
        assertNull(myLinkedList.getLast());
    }

    @Test
    public void testRemoveMultipleCoincidences() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("people");
        myLinkedList.add("hello");
        myLinkedList.add("world");
        myLinkedList.add("around");
        myLinkedList.add("the");
        myLinkedList.add("digital");
        myLinkedList.add("people");
        myLinkedList.add("heavy");
        myLinkedList.add("sound");
        myLinkedList.add("safe");
        myLinkedList.add("world");
        myLinkedList.add("people");

        assertEquals(12, myLinkedList.size());
        assertEquals("people", myLinkedList.get(0));
        assertEquals("people", myLinkedList.getFirst().getValue());
        assertEquals("people", myLinkedList.get(11));
        assertEquals("people", myLinkedList.getLast().getValue());
        assertEquals("people", myLinkedList.get(6));


        assertTrue(myLinkedList.remove("people"));

        assertEquals(9, myLinkedList.size());
        assertEquals("hello", myLinkedList.get(0));
        assertEquals("hello", myLinkedList.getFirst().getValue());
        assertEquals("world", myLinkedList.get(8));
        assertEquals("world", myLinkedList.getLast().getValue());
        assertEquals("sound", myLinkedList.get(6));
    }
}
