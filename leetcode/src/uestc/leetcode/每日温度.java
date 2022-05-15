package uestc.leetcode;

import java.util.Stack;

/**
 * @author: zhangjin
 * @title: 每日温度
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1511:26
 */
public class 每日温度 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            if(stack.isEmpty()) {stack.add(i);continue;}
            while (!stack.isEmpty())
            {
                int currentTemperatures=temperatures[i];
                int preTemperature=temperatures[stack.peek()];
                if(currentTemperatures<=preTemperature)
                {
                    stack.add(i);break;
                }else{
                    int pre=stack.pop();
                    ans[pre]=i-pre;
                }
            }
            if(stack.isEmpty()||stack.peek()!=i) stack.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
}
