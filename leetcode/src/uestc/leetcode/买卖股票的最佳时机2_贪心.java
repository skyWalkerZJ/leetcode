package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 买卖股票的最佳时机2_贪心
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2319:50
 */
public class 买卖股票的最佳时机2_贪心 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
