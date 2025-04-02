import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price=sc.nextDouble();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入等级：");
        String grade=sc.next();
        if(month>=5&&month<=10&&grade.equals("头等舱")){
            price=price*0.9;
            System.out.println("旺季头等舱："+price);
        }else if(month>=5&&month<=10&&grade.equals("经济舱")){
            price=price*0.85;
            System.out.println("旺季经济舱："+price);
        }else if(month>=1&&month<=4&&grade.equals("头等舱")){
          price=price*0.7;
            System.out.println("淡季头等舱："+price);
        }else if(month>=1&&month<=4&&grade.equals("经济舱")){
            price=price*0.65;
            System.out.println("淡季经济舱："+price);
        }else if((month==11||month==12)&&grade.equals("头等舱")){
            price=price*0.7;
            System.out.println("淡季头等舱："+price);
        }else if ((month==11||month==12)&&grade.equals("经济舱")){
            price=price*0.65;
            System.out.println("淡季经济舱："+price);
        }
    }
}
