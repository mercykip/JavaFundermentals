package com.example.JavaFundermentals.JavaFundermentals.trees;

public class BinarySearchTree {
    Node root;

    BinarySearchTree(){
        root = null;
    }

    //PostOrder Traversal - Left:Right:rootNode (LRn)
    void postOrder(Node node)  {
        if (node == null)
            return;

        // first traverse left subtree recursively
        postOrder(node.left);

        // then traverse right subtree recursively
        postOrder(node.right);

        // now process root node
        System.out.print(node.data + " ");
    }
    // InOrder Traversal - Left:rootNode:Right (LnR)
    void inOrder(Node node)  {
        if (node == null)
            return;
        //first traverse left subtree recursively
        inOrder(node.left);

        //then go for root node
        System.out.print(node.data + " ");

        //next traverse right subtree recursively
        inOrder(node.right);
    }

    //PreOrder Traversal - rootNode:Left:Right (nLR)
    void preOrder(Node node)  {
        if (node == null)
            return;

        //first print root node first
        System.out.print(node.data + " ");
        // then traverse left subtree recursively
        preOrder(node.left);
        // next traverse right subtree recursively
        preOrder(node.right);
    }
    // Wrappers for recursive functions
    void postOrder_traversal()  {
        postOrder(root);  }
    void inOrder_traversal() {
        inOrder(root);   }
    void preOrder_traversal() {
        preOrder(root);  }
    public static void main(String[] args) {
        BinarySearchTree bs=new BinarySearchTree();
        Node root = null;
        //construct a BST
        bs.root=new Node(45);
        bs.root.left=new Node(10);
        bs.root.right=new Node(90);
        bs.root.left.left=new Node(7);
        bs.root.left.right=new Node(12);

        //PreOrder Traversal
        System.out.println("BST => PreOrder Traversal:");
        bs.preOrder_traversal();
        //InOrder Traversal
        System.out.println("\nBST => InOrder Traversal:");
        bs.inOrder_traversal();
        //PostOrder Traversal
        System.out.println("\nBST => PostOrder Traversal:");
        bs.postOrder_traversal();

    }
}
