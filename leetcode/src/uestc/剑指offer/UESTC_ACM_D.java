package uestc.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author: zhangjin
 * @title: kanadeHates3
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/411:21
 */
public class UESTC_ACM_D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        long[] narr=new long[n];
        int[] marr=new int[m];
        for(int i=0;i<n;i++)
        {
            narr[i]=scanner.nextLong();
        }
        for(int i=0;i<m;i++)
        {
            marr[i]=scanner.nextInt();
        }
        ArrayList arrayList=new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(narr[i]%3!=0) arrayList.add(narr[i]);
            else{
                ArrayList list = divide3(narr[i]);
                arrayList.addAll(list);
            }
        }

        for(int i=0;i<m;i++)
        {
            System.out.print(arrayList.get(marr[i]-1)+" ");
        }
    }
    public static ArrayList divide3(long num)
    {
        int i=1;
        while (num%3==0)
        {
            num=num/3;
            i*=3;
        }
        ArrayList list=new ArrayList(Collections.nCopies(i,num));
        return list;
    }
}
