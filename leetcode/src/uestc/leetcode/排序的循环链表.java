package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 排序的循环链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1316:15
 */
public class 排序的循环链表 {
    public Node insert(Node head, int insertVal) {
        if(head==null) {head=new Node();head.val=insertVal;return head;}
        cycle(head,insertVal);
        return head;
    }
    public static void cycle(Node head,int insertVal)
    {
        Node start=head;
        while (start!=head)
        {
            if(start.val<=start.next.val)
            {
                if(insertVal>=start.val&&insertVal<=start.next.val)
                {
                    Node temp=new Node();
                    temp.val=insertVal;
                    Node p=start.next;
                    start.next=temp;
                    temp.next=p;
                    break;
                }
            }else{
                if(insertVal<=start.next.val)
                {
                    Node temp=new Node();
                    temp.val=insertVal;
                    Node p=start.next;
                    start.next=temp;
                    temp.next=p;
                    break;
                }
            }
            start=start.next;
        }
    }
}
