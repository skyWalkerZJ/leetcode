package uestc.leetcode;

/**
 * @author admin
 * @ClassName 合并零之间的节点_链表.java
 * @Description TODO
 * @createTime 2022年02月21日 09:25:00
 */

public class 合并零之间的节点_链表 {
    //[0,3,1,0,4,5,2,0]
    //[4,11]
    //[4,11,5,2,0]
    public ListNode mergeNodes(ListNode head) {
            ListNode node=head;
            ListNode end=head;
            int ZeroFlag=0;
            int NotZeroFlag=0;
            int sum=0;
            while(node!=null)
            {
                if(node.val==0)
                {
                    end.val=sum;
                    sum=0;
                    ZeroFlag=1;
                    NotZeroFlag=0;
                }else{
                    NotZeroFlag=1;
                    sum+=node.val;
                }
                if(ZeroFlag==1&&NotZeroFlag==1)
                {
                    end.next=node;
                    end=end.next;
                    ZeroFlag=0;
                }
                node=node.next;
            }
            end.next=null;
            return head.next;
        }
}
