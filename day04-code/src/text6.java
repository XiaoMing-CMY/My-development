import java.util.Scanner;

public class text6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数：");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("奖励一辆自行车！");
            } else if (score >= 90 && score <= 94) {
                System.out.println("奖励游乐场玩一天！");
            } else if (score >= 80 && score <= 89) {
                System.out.println("奖励一个变形金刚！");
            } else if (score <= 79) {
                System.out.println("打你一顿！");
            }
            } else {
                System.out.println("输入错误！");
            }

    }
}
