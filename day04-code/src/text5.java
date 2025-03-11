import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的电影票票号：");
        int ticket = sc.nextInt();
        if(ticket>=0&&ticket<=100) {


            if (ticket % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }
    }
}
