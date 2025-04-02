import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price=sc.nextDouble();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入舱位：");
        String grade=sc.next();
    }
}
