package uestc.leetcode;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 验证外星语词典
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/149:37
 */
public class 验证外星语词典 {
    HashMap<Character,Integer> orderMap;
    public boolean isAlienSorted(String[] words, String order) {
        orderMap=new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i),i);
        }
        for (int i = 0; i < words.length-1; i++) {
            if(!compareString(words[i],words[i+1])) return false;
        }
        return true;
    }
    public boolean compareString(String a, String b)
    {
        //a比b小 return true
        for (int i = 0; i < a.length()&&i<b.length(); i++) {
            if(orderMap.get(a.charAt(i))<orderMap.get(b.charAt(i))) return true;
            else if(orderMap.get(a.charAt(i))==orderMap.get(b.charAt(i)))
            {
                continue;
            }else{
                return false;
            }
        }
        if(a.length()>b.length()) return false;
        return true;
    }
}
