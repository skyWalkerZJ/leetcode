package uestc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author: zhangjin
 * @title: RandomizedSet
 * @ProjectName: leetcode
 * @Description:O(1) 时间插入、删除和获取随机元素
 * @date: 2022/5/1316:34
 */
public class O1时间插入删除和获取随机元素 {
class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> hashMap;
    Random random;
    public RandomizedSet() {
        list=new ArrayList<>();
        hashMap=new HashMap<>();
        random=new Random();
    }

    public boolean insert(int val) {
        if(hashMap.containsKey(val)) return false;
        int index=list.size();
        list.add(val);
        hashMap.put(val,index);
        return true;
    }

    public boolean remove(int val) {
        if(!hashMap.containsKey(val)) return false;
        int index=hashMap.get(val);
        int last=list.get(list.size()-1);
        hashMap.put(last,index);
        hashMap.remove(val);
        list.set(index,last);
        list.remove(list.size()-1);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}
}
