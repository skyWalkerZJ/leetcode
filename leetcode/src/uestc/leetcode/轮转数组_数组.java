package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 轮转数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2216:49
 */
public class 轮转数组_数组 {
    //临时存储
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] temp=new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=nums[nums.length-k+i];
        }
        for (int i = nums.length-k-1; i >=0; i--) {
            nums[i+k]=nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i]=temp[i];
        }
    }
    //数组翻转
    public void rotate_1(int[] nums, int k) {
        k=k%nums.length;
        //翻转整个数组
        int left=0;int right=nums.length-1;
        while (left<=right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
        //翻转前k个
        left=0;right=k-1;
        while (left<=right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
        //翻转后面所有
        left=k;right=nums.length-1;
        while (left<=right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
    }
}
