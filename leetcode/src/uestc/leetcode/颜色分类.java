package uestc.leetcode;

/**
 * @author admin
 * @ClassName 颜色分类.java
 * @Description TODO
 * @createTime 2022年02月26日 13:48:00
 */
public class 颜色分类 {
    //通过遍历获取0 1 2的个数，然后赋值
    public void sortColors(int[] nums) {
        int red=0,green=0,blue=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) red++;
            else if(nums[i]==1) green++;
            else blue++;
        }
        for (int i = 0; i < red; i++) {
            nums[i]=0;
        }
        for (int i = 0; i < green; i++) {
            nums[red+i]=1;
        }
        for (int i = 0; i <blue; i++) {
            nums[green+red+i]=2;
        }
        System.out.println();
    }
    //单指针
    public void sortColors_1(int[] nums) {

    }
}
