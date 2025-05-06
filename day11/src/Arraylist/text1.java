package Arraylist;

import java.util.ArrayList;

public class text1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //散出0索引处的元素
        // String s=list.remove(0);
        //删除指定元素
        //boolean s1=list.remove("ddd");
        //改变指定索引处的元素
        //String s=list.set(2,"ddd");
        //获取指定索引处的元素
        //String s=list.get(1);
        for (int i = 0; i < list.size(); i++) {
            String result=list.get(i);
            System.out.println(result);
        }
        System.out.println(list);
    }
}
