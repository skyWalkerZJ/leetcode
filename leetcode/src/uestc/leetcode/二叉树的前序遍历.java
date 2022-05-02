package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 二叉树的前序遍历
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2119:59
 */
public class 二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        preorderTraversal(root,ans);
        return ans;
    }
    public static void preorderTraversal(TreeNode root,List list)
    {
        if(root!=null) list.add(root.val);
        if(root.left!=null) preorderTraversal(root.left,list);
        if(root.right!=null) preorderTraversal(root.right,list);
    }
}
