package uestc.leetcode;

import java.util.Stack;

/**
 * @author: zhangjin
 * @title: 两数相加2
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/813:45
 */
public class 两数相加2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        ListNode ans=null;
        ListNode t1=l1;ListNode t2=l2;
        while (t1!=null)
        {
            s1.add(t1);
            t1=t1.next;
        }
        while (t2!=null)
        {
            s2.add(t2);
            t2=t2.next;
        }
        int jinwei=0;
        while (!s1.isEmpty()&& !s2.isEmpty())
        {
            ListNode listNode=new ListNode();
            ListNode n1=s1.pop();
            ListNode n2=s2.pop();
            listNode.val=(n1.val+n2.val+jinwei)%10;
            jinwei=(n1.val+n2.val+jinwei)/10;
            listNode.next=ans;
            ans=listNode;
        }
        while (!s1.isEmpty())
        {
            ListNode listNode=new ListNode();
            ListNode n1=s1.pop();
            listNode.val=(n1.val+jinwei)%10;
            jinwei=(n1.val+jinwei)/10;
            listNode.next=ans;
            ans=listNode;
        }while (!s2.isEmpty())
        {
            ListNode listNode=new ListNode();
            ListNode n1=s2.pop();
            listNode.val=(n1.val+jinwei)%10;
            jinwei=(n1.val+jinwei)/10;
            listNode.next=ans;
            ans=listNode;
        }
        if(jinwei!=0) {
            ListNode listNode = new ListNode(jinwei);
            listNode.next=ans;
            ans=listNode;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(3);
        addTwoNumbers(listNode1,listNode);
    }
}
