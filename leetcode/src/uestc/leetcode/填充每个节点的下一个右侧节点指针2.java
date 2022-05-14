package uestc.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 填充每个节点的下一个右侧节点指针2
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/1717:01
 */
class node {
    public int val;
    public node left;
    public node right;
    public node next;

    public node() {}

    public node(int _val) {
        val = _val;
    }

    public node(int _val, node _left, node _right, node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class 填充每个节点的下一个右侧节点指针2 {
    //层次遍历
    public node connect(node root) {
        if(root==null) return null;
        Queue<node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int n=queue.size();
            node last=null;
            for (int i = 1; i <= n; i++) {
                node poll = queue.poll();
                if(poll.left!=null) queue.offer(poll.left);
                if(poll.right!=null) queue.offer(poll.right);
                if(i!=1) last.next=poll;
                last=poll;
            }
        }
        return root;
    }
}
