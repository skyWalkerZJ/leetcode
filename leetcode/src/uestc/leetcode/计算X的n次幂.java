package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 计算X的n次幂
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/1923:25
 */
public class 计算X的n次幂 {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(n==0) return 1;
        if(n==1) return x;
        if(x==1) return 1;

        if(x==-1){
            if(n%2==0) return 1;
            else return -1;
        }
        if(n==-2147483648) return 0;
        if(n<0) return 1.0/myPow(x,-n);
        int count=0;int t=n;
        while(t!=0)
        {
            t=t/2;
            count++;}
        t=n;
        int[] bin=new int[count];
        for(int i=count-1;i>=0;i--)
        {
            bin[i]=t%2;
            t=t/2;
        }
        double[] p=new double[count];
        for(int i=count-1;i>=0;i--){
            if(i==count-1) p[i]=x;
            else p[i]=p[i+1]*p[i+1];
        }
        double ans=1;
        for(int i=0;i<count;i++){
            if(bin[i]==1) ans*=p[i];
        }
        return ans;
    }
}
