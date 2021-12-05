package com.myCompany;

public class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode() {}

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
          this.value = value;
          this.left = left;
          this.right = right;
      }
}
