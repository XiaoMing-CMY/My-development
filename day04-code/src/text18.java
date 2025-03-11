public class text18 {
    public static void main(String[] args) {
        //定义一个被除数
        int a=100;
        //定义一个除数
        int b=37;
        //定义一个商
        int count=0;
        //循环
        while(a>=b){
            //被除数减去除数
            a=a-b;
            //商加一
            count++;
        }
        System.out.println("商为:"+count);
        System.out.println("余数为:"+a);
    }
}
