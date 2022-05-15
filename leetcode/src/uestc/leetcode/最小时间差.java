package uestc.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 最小时间差
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/149:53
 */
public class 最小时间差 {
    public static int findMinDifference(List<String> timePoints) {
        timePoints.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        int ans=Integer.MAX_VALUE;
        String end=(Integer.valueOf(timePoints.get(0).substring(0,2))+24)+timePoints.get(0).substring(2,5);
        timePoints.add(end);
        for(int i=1;i<timePoints.size();i++)
        {
            String a=timePoints.get(i-1);
            String b=timePoints.get(i);
            if(a.equals(b)) return 0;
            else{
                int temp=timeToMinutes(b)-timeToMinutes(a);
                ans=Math.min(ans,temp);
            }
        }
        return ans;
    }
    public static int timeToMinutes(String time)
    {
        return Integer.valueOf(time.substring(0,2))*60+Integer.valueOf(time.substring(3,5));
    }


    public int findMinDifference_1(List<String> timePoints) {
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < timePoints.size(); ++i) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes); // 相邻时间的时间差
            preMinutes = minutes;
        }
        ans = Math.min(ans, t0Minutes + 1440 - preMinutes); // 首尾时间的时间差
        return ans;
    }

    public int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }
}
