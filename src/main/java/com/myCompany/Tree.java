package com.myCompany;

public class Tree {

    TreeNode addNewNode(TreeNode treeNode) {
        return null;
    }

    TreeNode addNewNode(int value) {
        return new TreeNode(value);
    }

    TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.value += root2.value;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    void showTree(TreeNode treeNode) {
        if (treeNode == null) return;
        System.out.print(treeNode.value + " ");
        showTree(treeNode.left);
        showTree(treeNode.right);
    }
}
