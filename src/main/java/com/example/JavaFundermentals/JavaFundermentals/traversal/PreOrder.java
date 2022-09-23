package com.example.JavaFundermentals.JavaFundermentals.traversal;

import com.example.JavaFundermentals.JavaFundermentals.trees.Node;

public class PreOrder {
    Node root;

    public PreOrder() {
        this.root = null;
    }

    public static void main(String[] args) {
        PreOrder tree = new PreOrder();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(6);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.data + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }
}
