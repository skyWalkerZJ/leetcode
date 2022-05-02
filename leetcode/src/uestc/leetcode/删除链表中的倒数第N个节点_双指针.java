package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 删除链表中的倒数第N个节点_双指针
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2422:37
 */
public class 删除链表中的倒数第N个节点_双指针 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
