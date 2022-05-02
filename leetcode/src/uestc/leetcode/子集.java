package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 子集
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2223:28
 */
public class 子集 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        ans.add(list);
        for(int i=0;i<nums.length;i++)
        {
            int size=ans.size();
            for(int j=0;j<size;j++)
            {
                ArrayList<Integer> arrayList=new ArrayList<>(ans.get(j));
                arrayList.add(nums[i]);
                ans.add(arrayList);
            }
        }
        return ans;
    }
}
