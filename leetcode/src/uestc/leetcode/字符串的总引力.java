package uestc.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: zhangjin
 * @title: 字符串的总引力
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/111:13
 */
public class 字符串的总引力 {
    //暴力枚举 会time limit
    public  long appealSum(String s) {
        long ans=0;
        Tree tree=generateTree(s,true);
        Queue<Tree> queue=new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty())
        {
            Tree poll = queue.poll();
            ans+=check(poll.s);
            if(poll.left!=null) queue.add(poll.left);
            if(poll.right!=null) queue.add(poll.right);
        }
        return ans;
    }
    public static long check(String s)
    {
        HashSet<Character> set=new HashSet();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        return set.size();
    }
    public  Tree generateTree(String s,boolean leftOrRight)
    {
        Tree tree=new Tree(s,leftOrRight);
        if(s.length()!=1) {
            if(leftOrRight){//如果是左子树 左右都生成
            tree.left=generateTree(s.substring(0,s.length()-1),true);
            tree.right=generateTree(s.substring(1,s.length()),false);
            }else{
                tree.right=generateTree(s.substring(1,s.length()),false);
            }
        }
        return tree;
    }

     class Tree {
        String s;int val;boolean leftOrRight;
        Tree left;
        Tree right;
        Tree() {}
        public Tree(String s, int val, boolean leftOrRight, Tree left, Tree right) {
            this.s = s;
            this.val = val;
            this.leftOrRight = leftOrRight;
            this.left = left;
            this.right = right;
        }

        public Tree(int val, boolean leftOrRight) {
            this.val = val;
            this.leftOrRight = leftOrRight;
        }

        public Tree(String s, boolean leftOrRight) {
            this.s = s;
            this.leftOrRight = leftOrRight;
        }
    }
    public long appealSum_1(String s) {
        long ans=0L;long SumG=0L;
        int[] pos=new int[26];
        Arrays.fill(pos,-1);
        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-'a';
            SumG+=i-pos[c];
            ans+=SumG;
            pos[c]=i;
        }
        return ans;
    }
}
