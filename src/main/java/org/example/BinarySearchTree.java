package org.example;

class BinarySearchTree {
    Node node;

    public void insert(int value) {
        // Create new Node
        Node newNode = new Node(value);

        // Case 1: If empty tree
        if(node == null) {
            node = newNode;
        }
        // Case 2: Value < node.value
        else if(value < node.value) {
            insert(value);
        }
        // Case 3: Value > node.value
        else {
            insert(value);
        }

    }
}

class Node {
    int value;
    Node left;
    Node right;
    private int age;

    public Node(int value) {
        this.value=value;
        this.left = null;
        this.right = null;
    }
}
