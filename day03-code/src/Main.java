import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/100%10;
        System.out.printf("个位是："+ge+"十位是："+shi+"百位是："+bai);
        //转换数据过大时 进行强转会发生错误
    }
}