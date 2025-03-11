import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入女婿的酒量：");
        Scanner sc = new Scanner(System.in);
        int win = sc.nextInt();
        if(win>2){
            System.out.println("酒量不错！");

        }
    }
}