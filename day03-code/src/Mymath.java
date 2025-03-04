public class Mymath {
    //定义一个方法a，该方法接受一个整数参数n，并返回一个整数值
    public static int a(int n) {
        //单独定义上三个台阶
        //当传入的参数n=3时，执行下面代码块
        if(n==3)    {
        //返回递归调用a(n-1)+a(n-2)+1  +1：除了走一个台阶和两个台阶外还有一种方法
        //这里的a(n-1)+a(n-2)是递归调用自身  目的是计算之前台阶的情况
                return a(n-1)+a(n-2)+1;
            }
        //当参数n传入1/2时执行下面代码块
        if (n==1||n==2) {
        //直接返回n的值
            return n;
        }
        // 如果 n 既不等于 1、2 也不等于 3，则返回递归调用 a(n - 1)、a(n - 2) 和 a(n - 3) 的结果之和
        // 这是一种递归逻辑，通过不断调用自身来计算不同台阶数的情况
        return a(n-1)+a(n-2)+a(n-3);
    }
    //定义程序入口方法
    public static void main(String[] args) {
        //定义台阶数10
        int n = 10;
        //调用方法a并传入参数n  最后赋值给m
        int m =a(n);
        System.out.println(m);
    }
}
