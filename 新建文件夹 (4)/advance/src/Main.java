import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数:");
        int score=sc.nextInt();
        if(score>=90) {
            System.out.println("优秀");
        }
        else if(score>=80) {
            System.out.println("良好");
        }
        else if(score>=70) {
            System.out.println("中等");
        }
        else if(score>=60){
            System.out.println("及格");
            {
                System.out.println("继续努力");
            }
        }


    }
}