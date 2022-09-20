package com.example.JavaFundermentals.JavaFundermentals.trees;

public class BinaryTreeMaxDepth {
    //bottom up
    public static int maxDepth(TreeNode root){
        if(root ==null){
            return 0;
        }
        int left= maxDepth(root.left);
        int right=maxDepth(root.right);

        return Math.max(left, right)+1;


    }
    //Top down
    public static void maxDepth1(TreeNode root, int depth){
        int answer=0;
        if(root ==null){
            return;
        }
        if(root.left ==null && root.right ==null){
           answer=Math.max(answer,depth);
        }
      maxDepth1(root.left,depth + 1);
      maxDepth1(root.right, depth +1);

    }
    public static void main(String[] args) {
        BinarySearchTree bs=new BinarySearchTree();
        Node root = null;
        //construct a BST
        bs.root=new Node(3);
        bs.root.left=new Node(9);
        bs.root.right=new Node(20);
        bs.root.right.left=new Node(15);
        bs.root.right.right=new Node(7);

    }
}
