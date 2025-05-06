package studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {
    public static void startStudentSystem() {
        ArrayList<student> list = new ArrayList<>();
         while (true) {
            System.out.println("-------------------欢迎来到应科管理系统--------------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改信息");
            System.out.println("4.查看信息");
            System.out.println("5.退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择:");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addInfo(list);
                case "2" -> deleteInfo(list);
                case "3" -> updateInfo(list);
                case "4" -> showInfo(list);
                default -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }


            }
        }

    }
    public static void addInfo(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入你需要添加的学生的ID:");
            String id=sc.next();
            for (int i = 0; i < list.size(); i++) {
                student s=list.get(i);
                if(id.equals(s.getId())){
                    System.out.println("该ID已存在，请重新输入");
                    return;
                }
            }
            System.out.println("请输入你想要添加学生的姓名：");
            String name=sc.next();
            System.out.println("请输入你想要添加学生的年龄：");
            int age=sc.nextInt();
            System.out.println("请输入你想要添加学生的家庭住址：");
            String address=sc.next();
            student s=new student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            list.add(s);
            System.out.println("添加成功");
            break;

        }


    }
    public static void deleteInfo(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
            for (int i = 0; i < list.size(); i++) {
                student stu=list.get(i);
                System.out.println("请输入你需要删除的id");
                String s=sc.next();
                if(s.equals(stu.getId())){
                        list.remove(i);
                    System.out.println("删除成功！");
                        break;
                }
                else{
                    System.out.println("此id未被添加，请重新输入！");
                }
            }
    }
    public static void updateInfo(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            student stu=list.get(i);
            System.out.println("请输入你想修改学生信息的id");
            String s=sc.next();
            if(s.equals(stu.getId())){
                System.out.println("请输入修改后的id");
                String id=sc.next();
                System.out.println("请输入修改后的姓名");
                String name=sc.next();
                System.out.println("请输入修改后的年龄");
                int age=sc.nextInt();
                System.out.println("请输入修改后的家庭地址");
                String address=sc.next();
                stu.setId(id);
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                System.out.println("修改成功");
                return;
            }
            else{
                System.out.println("此id不存在，请先添加");
            }
        }
    }
    public static void showInfo(ArrayList<student> list){
        System.out.println("id"+"  "+"姓名"+"  "+"年龄"+"  "+"家庭住址");
        for (int i = 0; i < list.size(); i++) {
            student stu=list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }
}
