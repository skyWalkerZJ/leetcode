package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: zhangjin
 * @title: 二叉树的所有路径
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2012:43
 */
public class 二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        constructPaths(root,"",list);
        return list;
    }
   public static void constructPaths(TreeNode root,String path,List<String> paths)
   {
       if(root!=null)
       {
           path+=root.val;
       }
       if(root.left==null&&root.right==null)
       {
           paths.add(path);
       }
       path+="->";
       if(root.left!=null)
       {
           constructPaths(root.left,path,paths);
       }
       if(root.right!=null)
       {
           constructPaths(root.right,path,paths);
       }
   }
}
