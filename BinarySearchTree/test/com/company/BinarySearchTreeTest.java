package com.company;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void testAdd() {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.add(8);
        myTree.add(10);
        myTree.add(6);
        myTree.add(2);
        myTree.add(5);
        myTree.add(7);
        myTree.add(9);
        myTree.add(3);

//        assertEquals(3, myTree.getLevel());
        assertEquals(8, myTree.size());
    }

    @Test
    public void testToString() {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);
        myTree.add(3);
        myTree.add(7);
        myTree.add(2);
        myTree.add(4);

        assertEquals("[234678910]", myTree.toString());
    }

    @Test
    @Ignore
    public void testLevel() {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.add(8);
        myTree.add(10);
        myTree.add(6);
        myTree.add(2);
        myTree.add(5);
        myTree.add(7);
        myTree.add(9);
        myTree.add(3);

        assertEquals(3, myTree.getLevel());
    }

    @Test
    public void testContains() {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.add(8);
        myTree.add(10);
        myTree.add(6);
        myTree.add(2);
        myTree.add(5);
        myTree.add(7);
        myTree.add(9);
        myTree.add(3);

        assertTrue(myTree.contains(3));

//        myTree.add(8);
//        myTree.add(6);
//        myTree.add(10);
//        myTree.add(9);
//        myTree.add(3);
//        myTree.add(7);
//        myTree.add(2);
//        myTree.add(4);
//
//        assertTrue(myTree.contains(7));
    }
}