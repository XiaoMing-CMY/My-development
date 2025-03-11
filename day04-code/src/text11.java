import java.util.Scanner;

public class text11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的星期：");
        String day = sc.nextLine();
       /*简写写法
       switch(day){
            case"星期一"-> System.out.println("工作日");
            case"星期二"-> System.out.println("工作日");
            case"星期三"-> System.out.println("工作日");
            case"星期四"-> System.out.println("工作日");
            case"星期五"-> System.out.println("工作日");
            case"星期六"-> System.out.println("休息日");
            case"星期天"-> System.out.println("休息日");
            default-> System.out.println("输入有误");
        }

        *///原始写法
       /* switch(day){
            case"星期一":
                System.out.println("工作日");
                break;
            case"星期二":
                System.out.println("工作日");
                break;
            case"星期三":
                System.out.println("工作日");
                break;
            case"星期四":
                System.out.println("工作日");
                break;
            case"星期五":
                System.out.println("工作日");
                break;
            case"星期六":
                System.out.println("休息日");
                break;
            case"星期天":
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }

        */
        //case穿透写法
        switch(day){
            case"星期一","星期二","星期三","星期四","星期五":
                System.out.println("工作日");
                break;
            case"星期六","星期天":
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
