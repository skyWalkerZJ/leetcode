package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 二叉树的后续遍历
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2120:04
 */
public class 二叉树的后续遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        postorderTraversal(root,ans);
        return ans;
    }
    public static void postorderTraversal(TreeNode root,List ans)
    {
        if(root.left!=null) postorderTraversal(root.left,ans);
        if(root.right!=null) postorderTraversal(root.right,ans);
        ans.add(root.val);
    }
}
