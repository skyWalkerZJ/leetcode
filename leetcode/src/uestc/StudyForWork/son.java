package uestc.StudyForWork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangjin
 * @title: son
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2613:44
 */
public class son extends father{
    public void dosome()
    {
        System.out.println("i am son");
    }

    public static void main(String[] args) {
        father father=new son();
        father.dosome();
        List list=new ArrayList();
        list.add(null);
    }
}
