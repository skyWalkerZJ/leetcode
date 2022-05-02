package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 对称二叉树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2117:58
 */
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null&&root.right==null) return true;
        if(root.left!=null&&root.right!=null) return isSymmetric(root.left,root.right);
        return false;
    }
    public boolean isSymmetric(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null) return true;
        if(left.val!=right.val) return false;
        if(left==null||right==null) return false;
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
}
