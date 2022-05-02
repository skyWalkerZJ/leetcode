package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 二叉搜索树中的搜索
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2222:28
 */
public class 二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root!=null)
        {
            if(root.val==val) return root;
            else if(root.val>val){
                root=root.left;
            }else if(root.val<val)
            {
                root=root.right;
            }
        }
        return null;
    }
}
