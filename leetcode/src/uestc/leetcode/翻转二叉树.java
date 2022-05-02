package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 翻转二叉树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2222:33
 */
public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
