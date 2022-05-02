package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 二叉树的中序遍历
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2112:49
 */
public class 二叉树的中序遍历_递归 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        inorderTraversal(root,list);
        return list;
    }
    public static void inorderTraversal(TreeNode root,List list)
    {
        if(root.left!=null) inorderTraversal(root.left,list);
        list.add(root.val);
        if(root.right!=null) inorderTraversal(root.right,list);
    }
}
