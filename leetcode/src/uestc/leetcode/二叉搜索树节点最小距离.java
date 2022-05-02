package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 二叉搜索树节点最小距离
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2217:19
 */
public class 二叉搜索树节点最小距离 {
    public int minDiffInBST(TreeNode root) {
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null&&root.right==null) return Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        if(root.left!=null) {
            ans=Math.min(ans, root.val-findMaxInTree(root.left));
            ans=Math.min(ans,minDiffInBST(root.left));
        }
        if(root.right!=null) {
            ans=Math.min(ans,findMinInTree(root.right)-root.val);
            ans=Math.min(ans,minDiffInBST(root.right));
        }
        return ans;
    }
    public static int findMaxInTree(TreeNode treeNode)
    {
        if(treeNode==null) return Integer.MIN_VALUE;
        if(treeNode.right==null) return treeNode.val;
        if(treeNode.right!=null) return findMaxInTree(treeNode.right);
        return Integer.MIN_VALUE;
    }
    public static int findMinInTree(TreeNode treeNode)
    {
        if(treeNode==null) return Integer.MAX_VALUE;
        if(treeNode.left==null) return treeNode.val;
        if(treeNode.left!=null) return findMinInTree(treeNode.left);
        return Integer.MAX_VALUE;
    }
}
