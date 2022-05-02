package uestc.leetcode;

import java.util.ArrayList;

/**
 * @author admin
 * @ClassName 卡片.java
 * @Description 小蓝有很多数字卡片，每张卡片上都是数字 00 到 99。 小蓝准备用这些卡片来拼一些数，他想从 11 开始拼出正整数，每拼一个， 就保存起来，卡片就不能用来拼其它数了。 小蓝想知道自己能从 11 拼到多少。 例如，当小蓝有 3030 张卡片，其中 00 到 99 各 33 张，则小蓝可以拼出 11 到 1010， 但是拼 1111 时卡片 11 已经只有一张了，不够拼出 1111。 现在小蓝手里有 00 到 99 的卡片各 20212021 张，共 2021020210 张，请问小蓝可以从 11 拼到多少？ 提示：建议使用计算机编程解决问题
 * @createTime 2022年03月03日 18:33:00
 */
public class 卡片 {
    public static void main(String[] args) {
        int[] flag=new int[10];
        for (int j = 0; j < 10; j++) {
            flag[j]=2021;
        }
        int i=1;
        while(true)
        {
            int j=i;
            while(j!=0)
            {
                int temp=j%10;
                flag[temp]--;
                j=j/10;
            }
            for (int k = 0; k < 10; k++) {
                if(flag[k]==0) {System.out.println(i);return;}
            }
            i++;
        }
    }
}
