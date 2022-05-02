package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 跳跃游戏2_贪心
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2319:35
 */
public class 跳跃游戏2_贪心 {
    public int jump(int[] nums)
    {
        if(nums.length==1) return 0;
        return jump(nums,0,0);
    }
    public static int jump(int[] nums,int located,int count) {
        if(nums[located]+located>=nums.length-1){
            count++;
            return count;
        }else{
            int maxPosition=located;
            int nextJump=located;
            for(int i=located+1;i<=located+nums[located];i++)
            {
                if(i+nums[i]>=maxPosition) {
                    maxPosition = i + nums[i];
                    nextJump=i;
                }
            }
            count++;
            count=jump(nums,nextJump,count);
        }
        return count;
    }
}
