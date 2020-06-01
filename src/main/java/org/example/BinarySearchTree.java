package org.example;

class BinarySearchTree {
    Node node;

    public void insert(int value) {
        insert(node, value);
    }

    public void insert(Node node, int value) {
        // Create new Node
        Node newNode = new Node(value);

        // Case 1: If empty tree
        if(node == null) {
            node = newNode;
        }
        // Case 2: Value < node.value
        else if(value < node.value) {
            insert(node.left, value);
        }
        // Case 3: Value > node.value
        else {
            insert(node.right, value);
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
