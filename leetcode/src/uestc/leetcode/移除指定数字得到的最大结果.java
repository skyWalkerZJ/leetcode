package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 移除指定数字得到的最大结果
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/110:32
 */
public class 移除指定数字得到的最大结果 {
    public String removeDigit(String number, char digit) {
        if(number.length()==0) return "";
        String ans=null;
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                if(i!=number.length()-1)
                {
                    if(number.charAt(i+1)>number.charAt(i))
                    {
                        ans=number.substring(0,i)+number.substring(i+1,number.length());
                        break;
                    }
                }
            }
        }
        if(ans==null)
        {
            ans=number.substring(0,number.lastIndexOf(String.valueOf(digit)))+number.substring(number.lastIndexOf(String.valueOf(digit))+1,number.length());
        }
        return ans;
    }
}
