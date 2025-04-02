import java.util.Random;
public class text5 {
    public static void main(String[] args) {
        //做一个验证码 1.前四位是大小写英文字母 2.最后一位是数字
        //我该怎么办  定义一个数组包括所有字母
        char[] chs=new char[26];
        //需要哪些方法 遍历数组 获取数组中的每一位字母
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if(i<=90){
                chs[i]=(char)(65+i);
            }
        }
        String result="";
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex=r.nextInt(chs.length);
            result+=chs[randomIndex];
        }
        for(int i=0;i<2;i++){
            int number=r.nextInt(10);
            result+=number;
        }

        System.out.println("验证码是："+result);

    }
}

