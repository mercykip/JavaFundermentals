package com.example.JavaFundermentals.JavaFundermentals.traversal;
// Tree traversal in Java

import com.example.JavaFundermentals.JavaFundermentals.trees.Node;

public class InOrder {
    // Root of Binary Tree
    Node root;

    InOrder() {
        root = null;
    }

    public static void main(String[] args) {
        InOrder tree = new InOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(6);
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
    }

    void inorder(Node node) {
        if (node == null)
            return;
        // Traverse left
        inorder(node.left);
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse right
        inorder(node.right);
    }
}