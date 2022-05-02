package uestc.leetcode;

/**
 * @author admin
 * @ClassName 螺旋矩阵2.java
 * @Description TODO
 * @createTime 2022年03月05日 15:40:00
 */
public class 螺旋矩阵2 {
    public static int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int row=0,col=1;
        int count=2;
        res[0][0]=1;
        while (count<=(n*n))
        {
            //一直向右
            while (col<n&&res[row][col]==0)
            {
                res[row][col]=count;
                count++;
                col++;
            }
            col--;
            //不能再向右 改为向下
            row+=1;
            while (row<n&&res[row][col]==0)
            {
                res[row][col]=count;
                count++;
                row++;
            }
            row--;
            //不能再向下 改为向左
            col-=1;
            while (col>=0&&res[row][col]==0)
            {
                res[row][col]=count;
                count++;
                col--;
            }
            col++;
            //不能再向左，改为向上
            row-=1;
            while (row>=0&&res[row][col]==0)
            {
                res[row][col]=count;
                count++;
                row--;
            }
            row++;
            col+=1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = generateMatrix(3);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
