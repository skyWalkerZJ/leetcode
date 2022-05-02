package uestc.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 二叉树的层序遍历
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2112:55
 */
public class 二叉树的层序遍历 {
    public List<List<Integer>> levelOrder_1(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        List<Queue<TreeNode>> tree=new ArrayList<>();
        Queue<TreeNode> temp=new LinkedList<>();
        temp.add(root);
        tree.add(temp);
        List<Integer> temp1=new ArrayList<>();
        temp1.add(root.val);
        list.add(temp1);
        levelOrder(tree,list);
        return list;
    }
    public static void levelOrder(List<Queue<TreeNode>> tree,List<List<Integer>> res)
    {
        Queue<TreeNode> treeNodes=new LinkedList<>();
        List<Integer> integers=new ArrayList<>();
        Queue<TreeNode> lastLevel = tree.get(tree.size() - 1);
        while (!lastLevel.isEmpty())
        {
            TreeNode poll = lastLevel.poll();
            if(poll.left!=null) {treeNodes.add(poll.left);integers.add(poll.left.val);}
            if(poll.right!=null) {treeNodes.add(poll.right);integers.add(poll.right.val);}
        }
        if(treeNodes.isEmpty()) return;
        tree.add(treeNodes);
        res.add(integers);
        levelOrder(tree,res);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        ArrayList list=new ArrayList();
        list.add(root.val);
        ans.add(list);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode t = queue.poll();
                if(t.left!=null) {level.add(t.left.val);queue.add(t.left);}
                if(t.right!=null) {level.add(t.right.val);queue.add(t.right);}
            }
            if(!level.isEmpty()) ans.add(level);
        }
        return ans;
    }
}
