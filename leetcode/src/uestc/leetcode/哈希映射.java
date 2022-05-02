package uestc.leetcode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author admin
 * @ClassName 哈希映射.java
 * @Description TODO
 * @createTime 2022年03月04日 22:54:00
 */
public class 哈希映射 {
    class pair{
        private int key;
        private int value;

        public int getKey() {
            return key;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }

        public pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<pair>[] data=new LinkedList[BASE];
    private static final int BASE=764;
    public int get(int key){
        int hash = hash(key);
        Iterator iterator = data[hash].iterator();
        while (iterator.hasNext())
        {
            pair p= (pair) iterator.next();
            if(p.getKey()==key) return p.getValue();
        }
        return -1;
    }
    public void put(int key,int value)
    {
        int hash=hash(key);
        Iterator<pair> iterator = data[hash].iterator();
        while (iterator.hasNext())
        {
            pair p= iterator.next();
            if(p.getKey()==key) p.setValue(value);
        }
        data[hash].add(new pair(key,value));
    }
    public void remove(int key)
    {
        int hash=hash(key);
        Iterator<pair> iterator = data[hash].iterator();
        while (iterator.hasNext())
        {
            pair p= iterator.next();
            if(p.getKey()==key) data[hash].remove(p);
        }
    }
    public static int hash(int key)
    {
        return key%BASE;
    }
}
