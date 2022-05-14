package uestc.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhangjin
 * @title: 有效的字母异位词
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1317:27
 */
public class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
