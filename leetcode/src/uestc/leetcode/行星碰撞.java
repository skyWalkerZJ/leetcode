package uestc.leetcode;
import java.io.*;
import java.util.Stack;

/**
 * @author: zhangjin
 * @title: 行星碰撞
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1510:37
 */
public class 行星碰撞 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int num:asteroids)
        {
            if(stack.isEmpty()) stack.add(num);
            else{
                int peek=stack.peek();
                if(!(peek>0&&num<0)) stack.add(num);
                else{
                    if(Math.abs(num)<Math.abs(peek)) continue;
                    else if(Math.abs(num)==Math.abs(peek)) {stack.pop();continue;}
                    else {
                        boolean flag=false;
                        while (!stack.isEmpty())
                        {
                            flag=false;
                            peek=stack.peek();
                            if(!(peek>0&&num<0)) {stack.add(num);flag=true;break;}
                            if(Math.abs(peek)>Math.abs(num)) {flag=true;break;}
                            else if(Math.abs(peek)==Math.abs(num))
                            {
                                stack.pop();
                                flag=true;
                                break;
                            }else{
                                stack.pop();
                            }
                        }
                        if(!flag) stack.add(num);
                    }
                }
            }
        }
        Integer []ans=new Integer[stack.size()];
        ans=stack.toArray(ans);
        int[] res=new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            res[i]=ans[i];
        }
        return res;
    }
}
