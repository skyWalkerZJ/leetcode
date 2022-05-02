package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 两两交换链表中的节点
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/1923:01
 */
public class 两两交换链表中的节点_递归 {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head!=null&&head.next==null) return head;
        ListNode node=head;
        head=head.next;
        node.next=head.next;
        head.next=node;
        node.next=swapPairs(node.next);
        return head;
    }
}
