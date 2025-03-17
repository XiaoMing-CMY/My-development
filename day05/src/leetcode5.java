//if判断闰年
import java.util.Scanner;

public class leetcode5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int years = sc.nextInt();
        if(years%4==0&&years%100!=0||years%400==0){
            System.out.println("这是闰年");
        }
        else {
            System.out.println("这不是闰年");
        }
    }
}
