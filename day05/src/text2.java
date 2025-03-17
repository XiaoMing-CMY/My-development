
import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = true;
        if(number<2){
            System.out.println("这不是一个质数");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
                }
            }
        if (flag) {
            System.out.println("这是一个质数");
        }
        else {
            System.out.println("这不是一个质数");
        }
        }
    }
