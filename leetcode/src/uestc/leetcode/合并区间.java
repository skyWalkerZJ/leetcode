package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author admin
 * @ClassName 合并区间.java
 * @Description TODO
 * @createTime 2022年03月03日 22:01:00
 */
public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if(list.size()==0||intervals[i][0]>list.get(list.size()-1)[1]) list.add(intervals[i]);
            else{
                list.get(list.size()-1)[1]=Math.max(intervals[i][1],list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
