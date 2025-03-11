import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        System.out.println("请输入你的钱：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=100){
            System.out.println("吃网红餐厅");
        }
        else{
            System.out.println("吃沙县小吃");
        }
    }
}
