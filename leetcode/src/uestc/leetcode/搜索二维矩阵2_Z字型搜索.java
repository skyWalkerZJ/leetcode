package uestc.leetcode;

/**
 * @author admin
 * @ClassName 搜索二维矩阵2.java
 * @Description TODO
 * @createTime 2022年03月05日 16:33:00
 */
public class 搜索二维矩阵2_Z字型搜索{
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row!=matrix.length-1&&col!=0)
        {
            if(matrix[row][col]>target) col--;
            else if(matrix[row][col]<target) row++;
            else return true;
        }
        return false;
    }
}
