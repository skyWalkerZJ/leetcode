package uestc.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 省份数量
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/1617:29
 */
public class 省份数量_深度广度搜索_并查集 {
    //广度优先搜索
    public int findCircleNum(int[][] isConnected) {
        if(isConnected==null||isConnected.length==0) return 0;
        int count=0;
        int cow=isConnected.length;
        int col=isConnected[0].length;
        Queue<Integer> queue=new LinkedList();
        for (int i = 0; i <cow ; i++) {
            for (int j = 0; j < col; j++) {
                if(isConnected[i][j]==1)
                {
                    count++;
                    isConnected[i][j]=0;
                    queue.add(i);
                    queue.add(j);
                    while (!queue.isEmpty())
                    {
                        Integer temp = queue.poll();
                        for (int k = 0; k < cow; k++) {
                            if(isConnected[temp][k]==1){isConnected[temp][k]=0; queue.add(k);}
                            if(isConnected[k][temp]==1){isConnected[temp][k]=0; queue.add(k);}
                        }
                    }
                }else continue;
            }
        }
        return count;
    }
    //深度优先搜索
    public int findCircleNum_1(int[][] isConnected) {
        if(isConnected==null||isConnected[0].length==0) return 0;
        int count=0;
        int row=isConnected.length;
        int col=isConnected[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(isConnected[i][j]==1)
                {
                    isConnected[j][j]=0;
                    count++;
                    dfs(isConnected,i);
                    dfs(isConnected,j);
                }
            }
        }
        return count;
    }
    public static void dfs(int[][] isConnected,int i)
    {
        for (int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j]==1)
            {
                isConnected[i][j]=0;
                dfs(isConnected,j);
            }
            if(isConnected[j][i]==1)
            {
                isConnected[j][i]=0;
                dfs(isConnected,j);
            }
        }
    }
}
