package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>();
        /*while(true){
            System.out.println("请输入学生姓名");
            String s=sc.next();
            System.out.println("请输入学生年龄");
            int a=sc.nextInt();
            student s1=new student(s,a);
            list.add(s1);
            System.out.println("是否继续添加？（y/n）");
            if(sc.next().equals("n")){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            student str=list.get(i);
            System.out.println("姓名："+str.getName()+" 年龄："+str.getAge());
        }
*/
        for (int i = 0; i < 3; i++) {
            student std=new student();
            System.out.println("请输入学生姓名");
            String s=sc.next();
            System.out.println("请输入学生年龄");
            int a=sc.nextInt();
            std.setName(s);
            std.setAge(a);
            list.add(std);
        }
        for (int i = 0; i < list.size(); i++) {
            student str=list.get(i);
            System.out.println("姓名："+str.getName()+" 年龄："+str.getAge());
        }
    }
}
