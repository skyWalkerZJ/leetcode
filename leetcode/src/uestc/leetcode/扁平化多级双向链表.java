package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 扁平化多级双向链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1315:25
 */
public class 扁平化多级双向链表 {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }
    public static Node dfs(Node head)
    {
        Node last=head;
        while (head!=null)
        {
            if(head.child==null) {
                last=head;
                head=head.next;
            }
            else{
                Node nextNode=head.next;
                head.next=head.child;
                head.child.prev=head;
                Node end=dfs(head.child);
                head.child=null;
                if(nextNode!=null)
                {
                    end.next=nextNode;
                    nextNode.prev=end;
                    head=end;
                }
                last=head;
                head=head.next;
            }
        }
        return last;
    }
}
