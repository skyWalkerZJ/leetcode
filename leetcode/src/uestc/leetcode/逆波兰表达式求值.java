package uestc.leetcode;

import java.util.Stack;

/**
 * @author: zhangjin
 * @title: 逆波兰表达式求值
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1510:21
 */
public class 逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack=new Stack<>();
        Stack<Character> charStack=new Stack<>();
        for(String str:tokens)
        {
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
            {
                    int num1=numStack.pop();
                    int num2=numStack.pop();
                    if(str.equals("+"))
                    {
                        numStack.add(num1+num2);
                    }else if(str.equals("-"))
                    {
                        numStack.add(num2-num1);
                    }else if(str.equals("*"))
                    {
                        numStack.add(num1*num2);
                    }else if(str.equals("/"))
                    {
                        numStack.add(num2/num1);
                    }
            }else{
                numStack.add(Integer.valueOf(str));
            }
        }
        return numStack.pop();
    }
}
