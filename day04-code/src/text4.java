import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你实际支付的钱：");
        int n = sc.nextInt();
        if (n>=600) {
            System.out.println("付款成功");
        }
        else{
            System.out.println("付款失败");
        }
    }
}
