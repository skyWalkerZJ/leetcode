package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 移动零_双指针
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2219:20
 */
public class 移动零_双指针 {
    public void moveZeroes(int[] nums) {
        int findZero=0;
        int findNotZero=0;
        while (findNotZero<nums.length)
        {
            while (findZero<nums.length&&nums[findZero]!=0)
            {
                findZero++;
            }
            findNotZero=findZero+1;
            while (findNotZero<nums.length&&nums[findNotZero]==0)
            {
                findNotZero++;
            }
            if(findZero<nums.length&&findNotZero<nums.length){
            int temp=nums[findZero];
            nums[findZero]=nums[findNotZero];
            nums[findNotZero]=temp;
            }
        }
    }
}
