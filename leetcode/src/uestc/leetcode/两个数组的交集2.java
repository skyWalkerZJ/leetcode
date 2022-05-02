package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 两个数组的交集2
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2219:54
 */
public class 两个数组的交集2 {
    //哈希表
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ans=new int[Math.max(nums1.length,nums2.length)];
        int index=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(Integer num :nums1)
        {
            if(hashMap.containsKey(num))
            {
                hashMap.put(num,hashMap.get(num)+1);
            }else {
                hashMap.put(num,1);
            }
        }
        for(Integer num:nums2)
        {
            if(hashMap.containsKey(num)&&hashMap.get(num)>0)
            {
                ans[index]=num;
                index++;
                hashMap.put(num,hashMap.get(num)-1);
            }
        }
        return Arrays.copyOfRange(ans,0,index);
    }
    //排序+双指针
    public int[] intersect_1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
