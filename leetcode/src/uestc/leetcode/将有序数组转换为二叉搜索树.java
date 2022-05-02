package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 将有序数组转换为二叉搜索树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2222:49
 */
public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public static TreeNode sortedArrayToBST(int[] nums,int left,int right)
    {
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode treeNode=new TreeNode(nums[mid]);
        treeNode.left=sortedArrayToBST(nums,left,mid-1);
        treeNode.right=sortedArrayToBST(nums,mid+1,right);
        return treeNode;
    }
}
