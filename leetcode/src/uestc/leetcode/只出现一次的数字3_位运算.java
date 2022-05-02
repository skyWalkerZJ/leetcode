package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 只出现一次的数字3_位运算
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2221:45
 */
public class 只出现一次的数字3_位运算 {
    //a与a的相反数异或 可以找到a的第一位为1的数
    public int[] singleNumber(int[] nums) {
        int xorsum = 0;
        for (int num : nums) {
            xorsum ^= num;
        }
        // 防止溢出
        int lsb = (xorsum == Integer.MIN_VALUE ? xorsum : xorsum & (-xorsum));
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lsb) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1, type2};
    }

}
