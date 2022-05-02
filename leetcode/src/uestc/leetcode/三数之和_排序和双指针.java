package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 * @ClassName 三数之和_排序和双指针.java
 * @Description
 * @createTime 2022年02月20日 16:37:00
 */
public class 三数之和_排序和双指针 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>=1&&nums[i]==nums[i-1]) continue;
            int left=i+1,right=nums.length-1;
            int flag=1;
            while(left<right)
            {
                if(nums[left]+nums[right]<(-nums[i]))
                {
                    left++;
                }else if(nums[left]+nums[right]>(-nums[i]))
                {
                    right--;
                }else{
                    if(left>=1&&nums[left]==nums[left-1]&&lists.size()!=0&&lists.get(lists.size()-1).get(1)==nums[left]&&flag==0) {left++;continue;}
                    List list=new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    left++;
                    flag=0;
                }
            }
        }
        return lists;
    }
    public static List<List<Integer>> threeSum_1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>=1&&nums[i]==nums[i-1]) continue;
            int left=i+1,right=nums.length-1;
            while(left<right)
            {
                if(nums[left]+nums[right]<(-nums[i]))
                {
                    left++;
                }else if(nums[left]+nums[right]>(-nums[i]))
                {
                    right--;
                }else{
                    List list=new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4,3,5,1,4,2,7,9,-4,-5,-3};
        //int[] nums={-1,0,1,2,-1,-4};
        //int[] nums={3,0,3,2,-4,0,-3,2,2,0,-1,-5};
        System.out.println(threeSum(nums));
    }
}
