package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinarySearchTreeTest
{
    BinarySearchTree bst;

    @Before
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void verifyInsert()
    {
        // Create Tree below:
        //         9
        //       /   \
        //     4      20
        //   /  \    /  \
        //  1    6  15  170

        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);

        bst.root.preorderPrint();
    }
}
