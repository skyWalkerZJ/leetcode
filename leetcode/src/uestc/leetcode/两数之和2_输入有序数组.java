package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 两数之和2_输入有序数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2219:45
 */
public class 两数之和2_输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;int right=numbers.length-1;
        while (left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                return new int[]{left+1,right+1};
            }else if(numbers[left]+numbers[right]<target)
            {
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
}
