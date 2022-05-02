package uestc.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 岛屿数量_深广度搜索_并查集
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/1521:24
 */
public class 岛屿数量_深广度搜索_并查集 {
    //深度优先搜索
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1') count++;
                dfs(grid,i,j);
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int r,int c)
    {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    //广度优先搜索
     public static int numIslands_1(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int cow=grid.length;
        int col=grid[0].length;
        Queue<Integer> queue=new LinkedList<>();
        int count=0;
         for (int i = 0; i < cow; i++) {
             for (int j = 0; j < col; j++) {
                 if(grid[i][j]=='1') {
                     count++;
                     grid[i][j]='0';
                     queue.add(i*col+j);
                     while (!queue.isEmpty())
                     {
                         Integer temp = queue.poll();
                         int down=temp+col;
                         int right=temp+1;
                         int left=temp-1;
                         int up=temp-col;
                         if(up>=0&&grid[up/col][up%col]=='1')
                         {
                             grid[up/col][up%col]='0';
                             queue.add(up);
                         }
                         if(temp%col!=0&&grid[left/col][left%col]=='1')
                         {
                             grid[left/col][left%col]='0';
                             queue.add(left);
                         }
                         if(down<=col*cow-1&&grid[down/col][down%col]=='1')
                         {
                             grid[down/col][down%col]='0';
                             queue.add(down);
                         }
                         if(right%col!=0&&grid[right/col][right%col]=='1')
                         {
                             grid[right/col][right%col]='0';
                             queue.add(right);
                         }
                     }
                 }else continue;
             }
         }
        return count;
    }



    //并查集
    public static int numIslands_2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int cow = grid.length;
        int col = grid[0].length;
        int count=0;
        return count;
    }

    public static void main(String[] args) {
        char[][]grid=new char[][]{{'1','0','1','1','1'},{'1','0','1','0','1'},{'1','1','1','0','1'}};
        System.out.println(numIslands_1(grid));
    }
}
