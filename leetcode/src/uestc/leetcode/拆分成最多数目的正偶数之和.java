package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 拆分成最多数目的正偶数之和
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2820:50
 */
public class 拆分成最多数目的正偶数之和 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list=new ArrayList();
        if(finalSum%2==1) return list;
        long sum=0;
        for(long i=2;sum<=finalSum;i+=2)
        {
            if(sum+i<=finalSum)
            {
                sum+=i;
                list.add(i);
            }else{
                long temp=(long)list.get(list.size()-1)+finalSum-sum;
                list.remove(list.size()-1);
                list.add(temp);
                break;
            }
        }
        return list;
    }
}
