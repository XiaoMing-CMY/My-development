import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数:");
        int num1=sc.nextInt();
        System.out.println("输入第二个数：");
        int num2=sc.nextInt();
        System.out.println("num1"+"+"+"num2"+"="+(num1+num2));
        System.out.println("num1"+"-"+"num2"+"="+(num1-num2));
        System.out.println("num1"+"*"+"num2"+"="+(num1*num2));
        if(num2==0) {
            System.out.println("除数不能为0");
        }
        else {
            double quotient=(double)num1/num2;
            System.out.printf("%d÷ %d=%.2f\n",num1,num2,quotient);
        }
    }
}