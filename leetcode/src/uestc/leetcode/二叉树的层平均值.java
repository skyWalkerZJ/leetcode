package uestc.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 二叉树的层平均值
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2212:57
 */
public class 二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> treeNodes=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        if(root==null) return ans;
        treeNodes.offer(root);
        while (!treeNodes.isEmpty())
        {
            double size=treeNodes.size();
            double sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode poll = treeNodes.poll();
                if(poll.left!=null) treeNodes.add(poll.left);
                if(poll.right!=null) treeNodes.add(poll.right);
                sum+=poll.val;
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
