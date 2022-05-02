package uestc.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 相同的树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/1522:03
 */
public class 相同的树_深度优先{
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
        else if(p.val!=q.val) return false;
        else return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //广度优先搜索
    public boolean isSameTree_1(TreeNode p, TreeNode q) {
        if (p==null&&q==null) return true;
        if(p==null||q==null) return false;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(p);q2.add(q);
        while (!q1.isEmpty()&&!q2.isEmpty())
        {
            TreeNode t1 = q1.poll();
            TreeNode t2 = q2.poll();
            if(t1.val!=t2.val) return false;
            if (t1.left==null^t2.left==null)
            {
                return false;
            }
            if(t1.right==null^t2.right==null)
            {
                return false;
            }
            if(t1.left!=null) q1.add(t1.left);
            if(t1.right!=null) q1.add(t1.right);
            if(t2.left!=null) q2.add(t2.left);
            if(t2.right!=null) q2.add(t2.right);
        }
        return q1.isEmpty()&&q2.isEmpty();
    }
}
