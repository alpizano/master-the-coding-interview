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

    public void preorderPrint() {
        System.out.println(value);
        if(left != null) {
            left.preorderPrint();
        }
        if(right != null) {
            right.preorderPrint();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);

       //bst.root.preorderPrint();
    }

}
