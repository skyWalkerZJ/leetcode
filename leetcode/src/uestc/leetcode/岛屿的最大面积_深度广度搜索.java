package uestc.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 岛屿的最大面积_深度广度搜索
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2713:15
 */
public class 岛屿的最大面积_深度广度搜索 {
    //深度优先
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                {
                    ArrayList list=new ArrayList();
                    grid[i][j]=0;
                    list.add(1);
                    dfs(grid,i+1,j,list);
                    dfs(grid,i-1,j,list);
                    dfs(grid,i,j+1,list);
                    dfs(grid,i,j-1,list);
                    ans=Math.max(list.size(),ans);
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] grid,int i,int j,ArrayList list)
    {
        int row=grid.length;
        int col=grid[0].length;
        if(i>=row||i<0||j<0||j>=col||grid[i][j]==0)
        {
            return;
        }
            grid[i][j]=0;
            list.add(1);
            dfs(grid,i+1,j,list);
            dfs(grid,i-1,j,list);
            dfs(grid,i,j+1,list);
            dfs(grid,i,j-1,list);
    }
    //广度优先
    public static int maxAreaOfIsland_1(int[][] grid) {
        int ans=0;
        int cow=grid.length;
        int col=grid[0].length;
        Queue<Integer> queue=new LinkedList<>();
        int count=0;
        for (int i = 0; i < cow; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]==1) {
                    grid[i][j]=0;
                    count++;
                    queue.add(i*col+j);
                    while (!queue.isEmpty())
                    {
                        Integer temp = queue.poll();
                        int down=temp+col;
                        int right=temp+1;
                        int left=temp-1;
                        int up=temp-col;
                        if(up>=0&&grid[up/col][up%col]==1)
                        {
                            grid[up/col][up%col]=0;
                            queue.add(up);
                            count++;
                        }
                        if(temp%col!=0&&grid[left/col][left%col]==1)
                        {
                            grid[left/col][left%col]=0;
                            queue.add(left);
                            count++;
                        }
                        if(down<=col*cow-1&&grid[down/col][down%col]==1)
                        {
                            grid[down/col][down%col]=0;
                            queue.add(down);
                            count++;
                        }
                        if(right%col!=0&&grid[right/col][right%col]==1)
                        {
                            grid[right/col][right%col]=0;
                            queue.add(right);
                            count++;
                        }
                    }
                    ans=Math.max(ans,count);
                    count=0;
                }else continue;
            }
        }
        return ans;
    }
}
