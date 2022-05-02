package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 路径总和
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2222:15
 */
public class 路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return hasPathSum_1(root,0,targetSum);
    }
    public static boolean hasPathSum_1(TreeNode root,int currentTargetSum,int targetSum)
    {
        if(root==null) return false;
        if(root.val+currentTargetSum==targetSum&&root.left==null&&root.right==null) return true;
        return hasPathSum_1(root.left,currentTargetSum+root.val,targetSum)||hasPathSum_1(root.right,currentTargetSum+ root.val,targetSum);
    }
}
