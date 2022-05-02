package uestc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @ClassName 杨辉三角_动态规划.java
 * @Description TODO
 * @createTime 2022年02月21日 14:16:00
 */
public class 杨辉三角_动态规划 {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list=new ArrayList();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> thisList=new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i) thisList.add(1);
                else thisList.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
            }
            list.add(thisList);
        }
        return list;
    }
}
