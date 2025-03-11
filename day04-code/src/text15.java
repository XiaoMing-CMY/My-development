import java.util.Scanner;

public class text15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        System.out.println("请输入第二个数字：");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc1.nextInt();
        int count=0;
        int sum=0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                 sum = sum+i;
            }

        }

        System.out.println(count);
    }
}
//能被3和5整除的数字个数
