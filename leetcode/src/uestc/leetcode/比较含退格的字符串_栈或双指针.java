package uestc.leetcode;

import java.util.Stack;

public class 比较含退格的字符串_栈或双指针 {
    public static boolean backspaceCompare(String s, String t) {
        Stack s1=new Stack();
        Stack s2=new Stack();
        System.out.println(s1.isEmpty());
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='#') {
                if(!s1.isEmpty()) s1.pop();
            }
            else s1.push(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)=='#') {if(!s2.isEmpty()) s2.pop();}
            else s2.push(t.charAt(i));
        }
        return s1.equals(s2);
    }

    public static boolean backspaceCompare_1(String s, String t) {
        int i=s.length()-1;int j=t.length()-1;
        int skp1=0;int skp2=0;
        while(i>=0||j>=0) {

            while (i >= 0) {
                if (s.charAt(i) == '#') skp1++;
                else {
                    if (skp1 > 0) {skp1--;}
                    else {
                        break;
                    }
                }
                i--;
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') skp2++;
                else {
                    if (skp2 > 0) {skp2--;}
                    else {
                        break;
                    }
                }
                j--;
            }

            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare_1("ab##","c#d#"));
    }
}
