public class text17 {
    public static void main(String[] args) {
        //定义一个变量x,判断x是否为回文数
        int x = 121;
        //定义一个变量temp,用来保存x的值 方便最后用于比较输出false/true
        int temp = x;
        //定义一个变量sum,用来保存x的反转值
        int sum=0;
        while(x!=0) {
            int ge=x%10;
            x=x/10;
            sum=sum*10+ge;
        }
        System.out.println(sum==temp);
        }

    }

