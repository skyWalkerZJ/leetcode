package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 两数相除
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/115:13
 */
public class 两数相除 {
    public int divide(int dividend, int divisor) {
        int ans=0;
        if(divisor==Integer.MIN_VALUE)
        {
            return dividend==Integer.MIN_VALUE?1:0;
        }
        if(dividend==Integer.MIN_VALUE)
        {
            if(divisor==-1) return Integer.MAX_VALUE;
            if(divisor==1) return Integer.MIN_VALUE;
        }
        if(divisor==0) return 0;
        boolean rev=false;
        if(dividend>0)
        {
            dividend=-dividend;
            rev=!rev;
        }
        if(divisor>0)
        {
            divisor=-divisor;
            rev=!rev;
        }
        int left=1;int right=Integer.MAX_VALUE;
        while (left<right)
        {
            int mid=left+((right-left)>>1);
            //判断mid*divisor>divided与否 如果大于 left=mid+1 如果小于 right=mid-1
            boolean check=quickAdd(divisor,mid,dividend);
            if(check)
            {
                ans=mid;
                if(mid==Integer.MAX_VALUE) break;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return rev?-ans:ans;
    }
    public static boolean quickAdd(int y,int z,int x)
    {
        //如果z*y>x return true
        int res=0;int add=y;
        while (z!=0)
        {
            if((z&1)!=0)
            {
                if(res<x-add)
                {
                    return false;
                }
                res+=add;
            }
            if(z!=1)
            {
                if(add<x-add)
                {
                    return false;
                }
                add+=add;
            }
            z>>=1;
        }
        return true;
    }
}
