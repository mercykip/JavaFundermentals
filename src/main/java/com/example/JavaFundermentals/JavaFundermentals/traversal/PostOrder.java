package com.example.JavaFundermentals.JavaFundermentals.traversal;

import com.example.JavaFundermentals.JavaFundermentals.trees.Node;

public class PostOrder {
    Node root;

    public PostOrder() {
        root=null;
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }
        // Traverse left
        postOrder(node.left);
        //  Traverse right
        postOrder(node.right);
        //Traverse root
        System.out.print(node.data + "->");
    }

    public static void main(String[] args) {
        PostOrder tree = new PostOrder();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(6);
        System.out.println("\nPostorder traversal");
        tree.postOrder(tree.root);
    }
}
