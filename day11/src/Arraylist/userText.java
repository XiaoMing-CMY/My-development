package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class userText {
    public static void main(String[] args) {
        ArrayList<user> list=new ArrayList<>();
        user s1=new user(1,"张三","123456");
        user s2=new user(2,"张三","12345678");
        user s3=new user(3,"张三","123456789");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入id");
        int c=sc.nextInt();
        boolean flag=findUser(c);
        System.out.println(flag);
        for (int i = 0; i < list.size(); i++) {
            user str=list.get(i);
            if(c==str.getId()){
                System.out.println(str.getId()+" "+str.getUserName()+" "+str.getPassWord());
            }
        }
    }
    public static boolean findUser(int id){
        if(id==1||id==2||id==3){
            return true;
        }
        return false;
    */
        boolean flag=findUser(list,2);
        System.out.println(flag);
    }
    public static boolean findUser(ArrayList<user> list,int id) {
        for (int i = 0; i < list.size(); i++) {
            user u=list.get(i);
            int uid=u.getId();
            if(uid==id){
                return true;
            }
        }
        return false;
    }
}
