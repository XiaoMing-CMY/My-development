public class text4 {
    public static void main(String[] args) {
        //统计101-200之间有多少个素数，并输出所有素数
        int count=0;
        //外层循环控制101-200之间的数
        for (int i = 101; i <= 200; i++) {
            //定义一个标记 flag=true 表示是素数
            boolean flag=true;
            //内层循环控制2-i之间的数
            for(int j=2;j<i;j++){
                //如果i%j==0 说明i不是素数，修改标记flag=false  break;
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            //判断标记是否为true  如果是true 则输出i  count++
            if(flag){
                System.out.println("这是一个素数："+i);
                count++;
            }
        }
        System.out.println("一共有"+count+"个素数");
    }
}
