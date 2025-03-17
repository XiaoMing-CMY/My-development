//if判断等级
import java.util.Scanner;

public class leetcode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int number = sc.nextInt();
        if(number>=90&&number<=100){
            System.out.println("你的等级为A");
        }
        else if(number>=80&&number<=89){
            System.out.println("你的等级为B");
        }
        else if(number>=70&&number<=79){
            System.out.println("你的等级为C");
        }else if(number>=60&&number<=69){
            System.out.println("你的等级为D");
        }
        if(number>=0&&number<=59){
            System.out.println("你的等级为F");
        }
    }
}
