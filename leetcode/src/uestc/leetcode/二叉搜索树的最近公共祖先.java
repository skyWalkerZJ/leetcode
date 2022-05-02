package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 二叉搜索树的最近公共祖先
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2222:38
 */
public class 二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if((p.val-root.val)*(q.val-root.val)<=0) return root;
        if(p.val>root.val) return lowestCommonAncestor(root.right,p,q);
        if(p.val<root.val) return lowestCommonAncestor(root.left,p,q);
        return null;
    }
}
