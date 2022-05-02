package uestc.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author admin
 * @ClassName 无重复的最长子串_动态规划_滑动窗口.java
 * @Description TODO
 * @createTime 2022年02月14日 19:56:00
 */
public class 无重复的最长子串_动态规划_滑动窗口 {
    //动态规划
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxSize=0;
        int currentSize=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i]))
            {
                hashMap.put(chars[i],i);
                maxSize=Math.max(maxSize,hashMap.size());
            }else{
                //出现重复，需要删除重复之前的才是以当前字符结尾的最长子串
                Integer integer = hashMap.get(chars[i]);
                Object[] characters = hashMap.keySet().toArray();
                for(Object c:characters)
                {
                    if (hashMap.get((char)c)<=integer)
                    hashMap.remove((char)c);
                }
                hashMap.put(chars[i],i);
            }
        }
        return maxSize;
    }
    //滑动窗口
    public static int lengthOfLongestSubstring_1(String s) {
        int maxSize=0;
        char[] chars = s.toCharArray();
        int left=0,right=0;
        HashSet<Character> set=new HashSet<>();
        for (; right < chars.length; right++) {
            if(!set.contains(chars[right]))
            {
                set.add(chars[right]);
                maxSize=Math.max(maxSize,set.size());
            }else{
                set.remove(chars[left]);
                left++;
                right--;
            }
        }
        return maxSize;
    }
    public static int lengthOfLongestSubstring_2(String s) {
        int maxSize=0;
        char[] chars = s.toCharArray();
        int start=0,end=0;
        HashMap map=new HashMap();
        for (; end < chars.length; end++) {
            if(map.containsKey(chars[end]))
            {
                start=Math.max(start, (Integer) map.get(chars[end]));
            }
            map.put(chars[end],end);
            maxSize=Math.max(maxSize,end-start+1);
        }
        return maxSize;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("helloworldqweerwtetasddfgdfghrtyrtujhgjtytutwer"));
        System.out.println(lengthOfLongestSubstring_1("helloworldqweerwtetasddfgdfghrtyrtujhgjtytutwer"));
       /* HashMap<Character,Integer> hashMap=new HashMap<>();
        hashMap.put('w',5);
        hashMap.put('l',3);
        hashMap.put('o',4);
        System.out.println(hashMap.get('w'));*/
    }
}
