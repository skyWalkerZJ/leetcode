package uestc.剑指offer;

/**
 * @author: zhangjin
 * @title: 单词长度的最大乘积
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/215:24
 */
public class 单词长度的最大乘积 {
    public int maxProduct(String[] words) {
        int length=words.length;int ans=0;
        int[] mask=new int[length];
        for(int i=0;i<length;i++)
        {
            String word=words[i];
            int wordLength=word.length();
            for(int j=0;j<wordLength;j++)
            {
                mask[i]|=1<<(word.charAt(j)-'a');
            }
        }
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if((mask[i]&mask[j])==0)
                {
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}
