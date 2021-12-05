package com.myCompany;

public class Solution {
    public static void main(String[] args) {
        Tree root1 = new Tree();
        TreeNode r1 = root1.addNewNode(1);
        r1.left = root1.addNewNode(3);
        r1.right = root1.addNewNode(2);
        r1.left.left = root1.addNewNode(5);

        Tree root2 = new Tree();
        TreeNode r2 = root2.addNewNode(2);
        r2.left = root2.addNewNode(1);
        r2.right = root2.addNewNode(3);
        r2.left.left = root2.addNewNode(null);
        r2.left.right = root2.addNewNode(4);
        r2.right.left = root2.addNewNode(null);
        r2.right.right = root2.addNewNode(7);

        Tree mergedTree = new Tree();
        TreeNode resultTree = mergedTree.mergeTrees(r1, r2);
        System.out.println("Result tree: ");
        mergedTree.showTree(resultTree);
        System.out.println();

        Tree root3 = new Tree();
        TreeNode r13 = root3.addNewNode(1);

        Tree root4 = new Tree();
        TreeNode r24 = root4.addNewNode(1);
        r24.left = root4.addNewNode(2);

        Tree mergedTree1 = new Tree();
        TreeNode resultTree1 = mergedTree1.mergeTrees(r13, r24);
        System.out.println("Result tree: ");
        mergedTree.showTree(resultTree1);
    }
}
