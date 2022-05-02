package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 第一个错误的版本_二分查找
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2012:48
 */
public class 第一个错误的版本_二分查找 {
    static boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n) {
        int low=1;int high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)==true)
            {
                high=mid-1;
            }else if(isBadVersion(mid)==false)
            {
                low=mid+1;
            }
        }
        return low;
    }
}
