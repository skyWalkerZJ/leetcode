package uestc.leetcode;

/**
 * @author admin
 * @ClassName 买卖股票的最佳时机_动态规划.java
 * @Description TODO
 * @createTime 2022年02月20日 15:48:00
 */
public class 买卖股票的最佳时机_动态规划 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]-prices[i]>max)
                    max=prices[j]-prices[i];
            }
        }
        return max;
    }
    public int maxProfit_1(int[] prices)
    {
        if(prices.length<=1)
            return 0;
        int max=0;
        int min=prices[0];
        for (int i = 0; i < prices.length; i++) {
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
