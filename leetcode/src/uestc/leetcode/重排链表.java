package uestc.leetcode;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 重排链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/919:23
 */
public class 重排链表 {
    public void reorderList(ListNode head) {
        HashMap<Integer,ListNode> hashMap=new HashMap<>();
        ListNode temp=head;
        int left=1;
        while (temp!=null)
        {
            hashMap.put(left,temp);
            left++;
            temp=temp.next;
        }
        left=1;int right=hashMap.size();
        ListNode ans=null;
        ListNode end=null;
        while (left<=right)
        {
            ListNode leftNode=hashMap.get(left);
            ListNode rightNode=hashMap.get(right);
            if(left==1) {ans=leftNode;end=ans;}
            end.next=leftNode;
            end=end.next;
            end.next=rightNode;
            end=end.next;
            left++;
            right--;
        }
        end.next=null;
        head=ans;
    }
}
