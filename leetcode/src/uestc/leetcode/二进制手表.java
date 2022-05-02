package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 二进制手表
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2413:34
 */
public class 二进制手表 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 1024; ++i) {
            int h = i >> 6, m = i & 63; // 用位运算取出高 4 位和低 6 位
            if (h < 12 && m < 60 && Integer.bitCount(i) == turnedOn) {
                ans.add(h + ":" + (m < 10 ? "0" : "") + m);
            }
        }
        return ans;
    }
}
