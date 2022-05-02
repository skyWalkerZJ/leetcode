package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 左叶子之和
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2212:43
 */
public class 左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return sumOfLeftLeaves(root.left,true)+sumOfLeftLeaves(root.right,false);
    }
    public static int sumOfLeftLeaves(TreeNode root,boolean flag)//flag为true表示左
    {
        if(root==null) return 0;
        if(root.left==null&&root.right==null&&flag) return root.val;
        return sumOfLeftLeaves(root.left,true)+sumOfLeftLeaves(root.right,false);
    }
}
