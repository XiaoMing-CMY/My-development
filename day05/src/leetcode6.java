//while循环猜数字游戏
// 1.随机生成一个1-100之间的数字
// 2.猜数字
import java.util.Random;
import java.util.Scanner;

public class leetcode6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int r = rand.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你猜的数：");
            int n = sc.nextInt();
         if(r>n){
             System.out.println("小了");
         }

         else if(r<n){
             System.out.println("大了");
         }

         if(r==n){
             System.out.println("恭喜你猜对了！");
             break;
         }
        }

    }
}
