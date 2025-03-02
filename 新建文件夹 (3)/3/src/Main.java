public class Main {
    public static void main(String[] args) {
        double r=5;
        double area=Math.PI*r*r;
        System.out.println("圆的面积为："+area);
        short s1=200;
        short s2=150;
        int a=(int)s1+s2;
        System.out.println(a);
        byte b1=50;
        byte b2=60;
        int A=(int)b1+b2;
        System.out.println(A);
        char c='B';
        int i=2;
        char B=(char)(c+i);
        boolean isRaining=true,isweekend=false;
        boolean logicResult=isRaining && isweekend;
        //&&为逻辑判断，只有两边都为真时才为真
        System.out.println(logicResult);

    }
}