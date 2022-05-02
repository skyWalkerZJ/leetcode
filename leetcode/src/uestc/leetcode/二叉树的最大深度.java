package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 二叉树的最大深度
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2117:30
 */
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
