package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 合并两个有序数组_双指针
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2014:47
 */
public class 合并两个有序数组_双指针 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1=m-1,r2=n-1;
        int right=nums1.length-1;
        while(right>=0)
        {
            if (r1 >= 0 && r2 >= 0) {
                if(nums1[r1]>=nums2[r2]){
                    nums1[right]=nums1[r1];
                    r1--;
                }else{
                    nums1[right]=nums2[r2];
                    r2--;
                }
                right--;
            }else if(r1<0)
            {
                nums1[right]=nums2[r2];
                r2--;
                right--;
            }else{
                nums1[right]=nums1[r1];
                r1--;
                right--;
            }
        }
    }
}
