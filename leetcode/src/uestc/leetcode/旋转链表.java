package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 旋转链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2013:22
 */
public class 旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode temp=head;
        int length=0;
        while (temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        length+=1;
        k=k%length;
        temp.next=head;
        temp=head;
        for (int i = 1; i <length-k; i++) {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
