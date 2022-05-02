package uestc.leetcode;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 必须拿起的最小连续卡牌数
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/110:50
 */
public class 必须拿起的最小连续卡牌数 {
    public int minimumCardPickup(int[] cards) {
        int ans=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if(hashMap.containsKey(cards[i]))
            {
                ans=Math.min(ans,i-hashMap.get(cards[i]));
                hashMap.put(cards[i],i);
            }else{
                hashMap.put(cards[i],i);
            }
        }
        if(ans!=Integer.MAX_VALUE) return ans+1;
        return -1;
    }
}
