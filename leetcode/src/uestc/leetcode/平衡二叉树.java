package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 平衡二叉树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2217:44
 */
public class 平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(root.left==null&&root.right==null) return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(findDepth(root.left)-findDepth(root.right))<=1;
    }
    public static int findDepth(TreeNode treeNode)
    {
        if(treeNode==null) return 0;
        if(treeNode.left==null&&treeNode.right==null) return 1;
        return Math.max(1+findDepth(treeNode.left),1+findDepth(treeNode.right));
    }
}
