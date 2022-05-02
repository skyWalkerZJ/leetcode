package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 合并二叉树
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2713:52
 */
public class 合并二叉树_深度优先 {
    //深度优先
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1!=null&&root2!=null)
        {
            root1.val=root1.val+root2.val;
            root1.left=mergeTrees(root1.left,root2.left);
            root1.right=mergeTrees(root1.right,root2.right);
        }else if(root1!=null){
            return root1;
        }else if(root2!=null){
            root1=root2;
            return root1;
        }else return null;
        return root1;
    }
}
