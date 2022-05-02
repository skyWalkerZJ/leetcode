package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: TreeNode
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/1522:03
 */
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
