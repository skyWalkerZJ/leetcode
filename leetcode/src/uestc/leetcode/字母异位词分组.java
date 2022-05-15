package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 字母异位词分组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/1410:14
 */
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap=new HashMap<>();
        for(String str:strs)
        {
            char []chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            List<String> list=hashMap.getOrDefault(key,new ArrayList<>());
            list.add(str);
            hashMap.put(key,list);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
