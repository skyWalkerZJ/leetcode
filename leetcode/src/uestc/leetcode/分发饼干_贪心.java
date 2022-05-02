package uestc.leetcode;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 分发饼干_贪心
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2318:09
 */
public class 分发饼干_贪心 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int count=0;
        while (i<g.length&&j<s.length)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}
