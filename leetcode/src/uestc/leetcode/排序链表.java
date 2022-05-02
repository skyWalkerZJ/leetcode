package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 排序链表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2013:32
 */
public class 排序链表 {
    public ListNode sortList(ListNode head) {
        ListNode node=head;
        int count=0;
        while (node!=null)
        {
            count++;
            node=node.next;
        }
        int[] arr=new int[count];
        node=head;int i=0;
        while (node!=null)
        {
            arr[i]= node.val;
            i++;
            node=node.next;
        }
        Arrays.sort(arr);ListNode l=null;ListNode end=null;
        for (int j = 0; j <count ; j++) {
            ListNode t=new ListNode(arr[j]);
            if(j==0){
                l=t;
                end=t;
            }else{
                end.next=t;
                end=t;
            }
        }
        return l;
    }
}
