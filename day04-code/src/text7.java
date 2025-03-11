import java.util.Scanner;

public class text7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 1000;
        System.out.println("请输入你的会员级别：");
        int grade = sc.nextInt();
        if(grade>=1&&grade<=3) {
            if (grade == 1) {
                System.out.println("实际支付的钱为："+(price*0.9));
            } else if (grade == 2) {
                System.out.println("实际支付的钱为："+(price*0.8));
            } else if (grade == 3) {
                System.out.println("实际支付的钱为："+(price*0.7));
            } else {
                System.out.println("不打折！");
            }
        }
        else {
            System.out.println("你不是会员！");
        }
    }
}
