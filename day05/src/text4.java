import java.util.Random;
import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("请输入你想猜的数字：");
        int guessNumber=sc.nextInt();
        if(guessNumber>number){
            System.out.println("你猜的数字大了");
        }
        else if(guessNumber<number){
            System.out.println("你猜的数字小了");
        }
        else{
            System.out.println("恭喜你猜对了");
            break;
        }

    }

    }
}
