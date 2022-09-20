package com.example.JavaFundermentals.JavaFundermentals.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBT {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static int mixDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        //add the current node into the queue
        q.add(root);
        //initialize the depth variable
        int depth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                root = q.poll();
                if (root.left == null && root.right == null)
                    return depth;
                }
                if (root.left != null)
                    q.add(root.left);

                if (root.right != null)
                    q.add(root.right);

                depth++;
            }
            return 0;
        }

}
