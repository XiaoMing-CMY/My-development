package Arraylist;

import java.util.ArrayList;

public class phonrTest {
    public static void main(String[] args) {
        ArrayList<phone> list=new ArrayList<>();
        phone p1=new phone("锤子",2999);
        phone p2=new phone("苹果",8000);
        phone p3=new phone("小米",1000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<phone> resultList=getPhoneInfo(list);
        for (int i = 0; i < resultList.size(); i++) {
            phone p=resultList.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }
    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> list){
        ArrayList<phone> newList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            phone p=list.get(i);
            int pp=p.getPrice();
            if(pp<3000){
                newList.add(p);
            }
        }
        return newList;
    }

}
