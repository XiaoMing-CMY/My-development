import java.util.Random;
import java.util.Scanner;

public class leetcode7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        int count = 0;
        while(true) {
            System.out.println("请输入你猜的数字：" );
            int n = sc.nextInt();
            count++;
            if(n>number) {
                System.out.println("大了");
            }
            else if(n<number) {
                System.out.println("小了");
            }
            if(n==number) {
                System.out.println("恭喜你猜对了");
                break;
            }
            if(count==5){
                System.out.println("你已经猜了5次了，游戏结束");
                break;
            }
        }
    }
}
