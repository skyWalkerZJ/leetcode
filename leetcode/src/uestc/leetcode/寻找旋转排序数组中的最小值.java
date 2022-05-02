package uestc.leetcode;

public class 寻找旋转排序数组中的最小值 {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = (low +high) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int res[]=new int[]{9,10,11,12,1,2,3,4,5,6,7,8};
        System.out.println(findMin(res));
    }
}
