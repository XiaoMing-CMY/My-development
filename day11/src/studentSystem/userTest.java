package studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class userTest {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项，请重新输入");
            }
        }
    }

    public static void login(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if (!(u.getuserName().equals(userName))) {
                System.out.println("用户名未注册，请先注册");
                break;
            }
        }
        System.out.println("请输入密码:");
        String password = sc.next();
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if (!(u.getPassWord().equals(password))) {
                System.out.println("密码错误，请重新输入");
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(123);
            if (num >= 48 && num <= 57 || num >= 65 && num <= 90 || num >= 97 && num <= 122) {
                sb.append(num);
            }
        }
        String s = sb.toString();
        System.out.println("验证码为:" + s);
        System.out.println("请输入验证码:");
        String checkWord = sc.next();
        if (!(checkWord.equals(sb.toString()))) {
            System.out.println("验证码错误，请重新输入");
            return;
        }
        System.out.println("登录成功!");
        studentTest.startStudentSystem();
        return;
    }

    public static void register(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        user u = new user();
        while (true) {
            System.out.println("请输入用户名:");
            String userName = sc.next();
            if (userName.length() < 3 || userName.length() > 15) {
                System.out.println("用户名长度错误，请重新输入");
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                char c = userName.charAt(i);
                user count = list.get(i);
                if (count.getuserName().equals(userName)) {
                    System.out.println("用户名已存在，请重新输入");
                    return;
                } else if (!(c == 'a' || c == 'z') && (c == 'A' || c == 'Z') && (c == '0' || c == '9')) {
                    System.out.println("用户名格式错误，请重新输入");
                    return;
                }
            }
            System.out.println("请输入密码:");
            String password = sc.next();
            System.out.println("请输入确认密码:");
            String confirmPassword = sc.next();
            if (!password.equals(confirmPassword)) {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            System.out.println("请输入身份证号:");
            String idNumber = sc.next();
            for (int i = 0; i < idNumber.length(); i++) {
                char c = idNumber.charAt(0);
                if (c == '0') {
                    System.out.println("身份证号第一位不能为0，请重新输入");
                    return;
                } else if (idNumber.length() != 18) {
                    System.out.println("身份证号长度错误，请重新输入");
                    return;
                } else if (sb.length() >= 17) {
                    String s = idNumber.substring(0, 17);
                    for (int j = 0; j < s.length(); j++) {
                        if (!(s.charAt(j) == '0' || s.charAt(j) == '9')) {
                            System.out.println("身份证号格式错误，请重新输入");
                            return;
                        }
                    }
                }
            }
            u.setuserName(userName);
            u.setPassWord(password);
            u.setIdNumber(idNumber);
            list.add(u);
            System.out.println("注册成功");
            break;
        }
    }

    public static void forgetPassword(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if (!(u.getuserName().equals(userName))) {
                System.out.println("用户名未注册，请先注册");
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println("请输入身份证号:");
        String idNumber = sc.next();
        for (int i = 0; i < idNumber.length(); i++) {
            char c = idNumber.charAt(0);
            if (c == '0') {
                System.out.println("身份证号第一位不能为0，请重新输入");
                return;
            } else if (idNumber.length() != 18) {
                System.out.println("身份证号长度错误，请重新输入");
                return;
            } else if (sb.length() >= 17) {
                String s = idNumber.substring(0, 17);
                for (int j = 0; j < s.length(); j++) {
                    if (!(s.charAt(j) == '0' || s.charAt(j) == '9')) {
                        System.out.println("身份证号格式错误，请重新输入");
                        return;
                    }
                }
            }
            System.out.println("请输入手机号码:");
            String phoneNumber = sc.next();
            user u=null;
            for (int j = 0; j < list.size(); j++) {
                u = list.get(j);
                if (!(u.getIdNumber().equals(idNumber)) && !(u.getPhoneNumber().equals(phoneNumber))) {
                    System.out.println("身份证号或手机号错误，请重新输入");
                    return;
                }
            }
            System.out.println("请输入新密码：");
            String newPassword = sc.next();
            System.out.println("请输入确认密码：");
            String confirmPassword = sc.next();
            if (!(newPassword.equals(confirmPassword))) {
                System.out.println("两次密码不一致，请重新输入");
                return;
            }
            u.setPassWord(newPassword);
            System.out.println("密码修改成功");
            break;
        }
    }
}
