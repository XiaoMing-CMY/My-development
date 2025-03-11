import java.util.Scanner;

public class text10 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("请输入星期几：");
        String days = day.nextLine();
        switch(days){
            case "星期一":
                System.out.println("今天跑步");
                break;
            case "星期二":
                System.out.println("今天游泳");
                break;
            case "星期三":
            System.out.println("今天慢走");
                break;
            case "星期四":
                System.out.println("今天骑动感单车");
                break;
            case "星期五":
                System.out.println("今天拳击");
                break;
            case "星期六":
                System.out.println("今天爬山");
                break;
            case "星期天":
                System.out.println("今天好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期！");
                break;

        }
    }
}
