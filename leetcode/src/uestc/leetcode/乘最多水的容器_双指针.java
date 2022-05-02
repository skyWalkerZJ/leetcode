package uestc.leetcode;

/**
 * @author admin
 * @ClassName 乘最多水的容器_双指针.java
 * @Description 对O(n)的算法写一下自己的理解，一开始两个指针一个指向开头一个指向结尾，此时容器的底是最大的，接下来随着指针向内移动，会造成容器的底变小，
 * 在这种情况下想要让容器盛水变多，就只有在容器的高上下功夫。 那我们该如何决策哪个指针移动呢？
 * 我们能够发现不管是左指针向右移动一位，还是右指针向左移动一位，容器的底都是一样的，都比原来减少了
 * 1。这种情况下我们想要让指针移动后的容器面积增大，就要使移动后的容器的高尽量大，所以我们选择指针所指的高较小的那个指针进行移动，
 * 这样我们就保留了容器较高的那条边，放弃了较小的那条边，以获得有更高的边的机会。
 * @createTime 2022年02月20日 16:10:00
 */
public class 乘最多水的容器_双指针 {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=Math.min(height[left],height[right])*(right-left);
        while(left!=right)
        {
            if(height[left]<height[right])
            {
                left++;
                max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            }else{
                right--;
                max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            }
        }
        return max;
    }
}
