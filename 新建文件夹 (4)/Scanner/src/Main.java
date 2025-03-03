import java.util.Scanner;
//导包
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //创建对象，表示准备要使用Scammer这个类
        System.out.println("请输入第一个数字");
        int number1=sc.nextInt();
        //接收数据
        System.out.println("请输入第二个数字");
        int number2=sc.nextInt();
        //接收数据

        System.out.println(number1+number2);
    }
}