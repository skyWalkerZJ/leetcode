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
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class 填充每个节点的下一个右侧节点指针2 {
    //层次遍历
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int n=queue.size();
            Node last=null;
            for (int i = 1; i <= n; i++) {
                Node poll = queue.poll();
                if(poll.left!=null) queue.offer(poll.left);
                if(poll.right!=null) queue.offer(poll.right);
                if(i!=1) last.next=poll;
                last=poll;
            }
        }
        return root;
    }
}
