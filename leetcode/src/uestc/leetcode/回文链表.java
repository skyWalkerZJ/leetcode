package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 回文链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1117:23
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = findMidNode(head);
        ListNode secondNode = reverseList(midNode);
        ListNode firstNode = head;
        while (firstNode!=null&&secondNode!=null)
        {
            if(firstNode.val!=secondNode.val) return false;
            firstNode=firstNode.next;
            secondNode=secondNode.next;
        }
        if(firstNode==null&&secondNode==null) return true;
        return false;
    }
    public static ListNode findMidNode(ListNode head)
    {
        ListNode right=head;
        ListNode left=head;
        while (right.next!=null&&right.next.next!=null)
        {
            right=right.next.next;
            left=left.next;
        }
        return left;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode h=null;;
        while(head!=null)
        {
            ListNode temp=head;
            head=head.next;
            temp.next=h;
            h=temp;
        }
        return h;
    }
}
