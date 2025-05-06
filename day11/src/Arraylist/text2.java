package Arraylist;

import java.util.ArrayList;

public class text2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("元素一");
        list.add("元素二");
        list.add("元素三");
        list.add("元素四");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
