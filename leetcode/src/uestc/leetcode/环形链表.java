package uestc.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: zhangjin
 * @title: 环形链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2623:10
 */
public class 环形链表 {
    //哈希表
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        HashMap map=new HashMap();
        while (temp!=null)
        {
            if(map.containsKey(temp))
            {
                return true;
            }else{
                map.put(temp,1);
            }
            temp=temp.next;
        }
        return false;
    }
    //哈希表
    public boolean hasCycle_1(ListNode head){
        ListNode temp=head;
        HashSet set=new HashSet();
        while (temp!=null)
        {
            if(set.contains(temp))
            {
                return true;
            }else{
                set.add(temp);
            }
            temp=temp.next;
        }
        return false;
    }
    //双指针
    public boolean hasCycle_2(ListNode head)
    {
        if(head==null) return false;
        ListNode first=head;
        ListNode second=head;
        while (first.next!=null&&first!=null)
        {
            first=first.next.next;
            second=second.next;
            if(first==second)
            {
                return true;
            }
        }
        return false;
    }
}
