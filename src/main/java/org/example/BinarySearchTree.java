package org.example;

class BinarySearchTree {
    Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node insert(Node node, int value) {
        // Create new Node
        Node newNode = new Node(value);

        // Case 1: If empty tree
        if(node == null) {
            //node = newNode;
            return newNode;
        }
        // Case 2: Value < node.value
        else if(value < node.value) {
            node.left =insert(node.left, value);
        }
        // Case 3: Value > node.value
        else {
            node.right = insert(node.right, value);
        }
        return node;
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value=value;
        this.left = null;
        this.right = null;
    }
}
