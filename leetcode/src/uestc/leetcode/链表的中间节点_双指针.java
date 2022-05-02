package uestc.leetcode;


/**
 * @author: zhangjin
 * @title: 链表的中间节点_双指针
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2422:33
 */
public class 链表的中间节点_双指针 {
    public ListNode middleNode(ListNode head) {
        ListNode pre=head;
        ListNode slow=head;
        while (pre!=null&&pre.next!=null)
        {
            pre=pre.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
