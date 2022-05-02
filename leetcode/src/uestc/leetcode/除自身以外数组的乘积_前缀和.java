package uestc.leetcode;

/**
 * @author admin
 * @ClassName 除自身以外数组的乘积.java
 * @Description 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * @createTime 2022年03月06日 20:55:00
 */
public class 除自身以外数组的乘积_前缀和 {
    public static int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int []ans=new int[length];
        ans[0]=1;
        for (int i = 1; i < length; i++) {
            ans[i]=ans[i-1]*nums[i-1];
        }
        int R=1;
        for (int i = length-1; i >=0; i--) {
            ans[i]=R*ans[i];
            R*=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4};
        productExceptSelf(arr);
    }
}
