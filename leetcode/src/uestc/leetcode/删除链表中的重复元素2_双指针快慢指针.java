package uestc.leetcode;

public class 删除链表中的重复元素2_双指针快慢指针 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=head.next;
        ListNode second=head;
        ListNode res=null;
        ListNode ans=null;
        int count=1;
        //1 1 2
        while(pre!=null)
        {
            if(pre.val==second.val)
            {
                count++;
            }else{
                if(count==1){
                    if(res==null) {res=second;res.next=null;ans=res;}
                    else {
                        res.next=second;
                        res=res.next;
                        res.next=null;
                    }
                }
                count=1;
                second=pre;
            }
            pre=pre.next;
        }
        if(second.next==null&&count==1){
            if(res==null) ans=second;
            else res.next=second;
        }
        return ans;
    }
}
