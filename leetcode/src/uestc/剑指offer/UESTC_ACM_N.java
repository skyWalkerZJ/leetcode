package uestc.剑指offer;

import java.util.Scanner;

/**
 * @author: zhangjin
 * @title: N
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/413:21
 */
public class UESTC_ACM_N {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        long ans=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=(arr[i]+arr[j])%998244353;
                ans=(ans*sum)%998244353;
            }
        }
        System.out.println(ans);
    }
}
