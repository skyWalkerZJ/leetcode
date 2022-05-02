package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 二叉树的最小深度
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2117:44
 */
public class 二叉树的最小深度 {
    public int minDepth(TreeNode root) {
       if(root==null) return 0;
       if(root.left==null&&root.right==null) return 1;
       int minDepth=Integer.MAX_VALUE;
       if(root.left!=null) minDepth=Math.min(minDepth,minDepth(root.left));
       if(root.right!=null) minDepth=Math.min(minDepth,minDepth(root.right));
       return minDepth+1;
    }
}
