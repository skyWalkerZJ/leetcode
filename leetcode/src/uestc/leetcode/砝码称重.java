package uestc.leetcode;

import java.util.*;

/**
 * @author: zhangjin
 * @title: 砝码称重
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/314:56
 */
class test implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
public class 砝码称重 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> hashSet=new HashSet();
        Integer []a=new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a,(Integer x,Integer y)->{return x-y;});
        for(int b:a)
        {
            if(hashSet.isEmpty())
            {
                hashSet.add(b);
            }else {
                HashSet<Integer> set=new HashSet();
                Iterator iterator = hashSet.iterator();
                while (iterator.hasNext())
                {
                    Integer next = (Integer) iterator.next();
                    set.add(next);
                    set.add(b);
                    set.add(next+b);
                    set.add(Math.abs(next-b));
                }
                hashSet=set;
            }
        }
        System.out.println(hashSet.size());
    }
}
