package uestc.leetcode;

/**
 * @author admin
 * @ClassName 两数相加_链表.java
 * @Description TODO
 * @createTime 2022年02月14日 17:32:00
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class 两数相加_链表 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode end=new ListNode();
        ListNode head=end;
        int jinwei=0;
        while(l1!=null&&l2!=null)
        {
            ListNode Node=new ListNode();
            int res=l1.val+l2.val+jinwei;
            jinwei=res/10;
            int benwei=res%10;
            Node.val=benwei;
            end.next=Node;
            end=Node;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null)
        {
            while(l1!=null){
            ListNode Node=new ListNode();
            int res=jinwei+l1.val;
            jinwei=res/10;
            int benwei=res%10;
            Node.val=benwei;
            end.next=Node;
            end=Node;
            l1=l1.next;
        }}
        else if(l2!=null)
        {
            while(l2!=null){
            ListNode Node=new ListNode();
            int res=jinwei+l2.val;
            jinwei=res/10;
            int benwei=res%10;
            Node.val=benwei;
            end.next=Node;
            end=Node;
            l2=l2.next;
        }}
        if(jinwei!=0)
        {
            ListNode node=new ListNode();
            node.val=jinwei;
            end.next=node;
            end=node;
        }
        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(20%2);
    }
}
