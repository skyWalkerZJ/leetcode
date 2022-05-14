package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 反转链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/813:31
 */
public class 反转链表 {
    //迭代
    public ListNode reverseList(ListNode head) {
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
    //递归
    public ListNode reverseList_1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
