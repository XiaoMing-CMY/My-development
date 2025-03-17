public class Main {
    public static void main(String[] args) {
       /*
       跳转控制语句 continue break
       continue 跳过某次循环体内容的执行，继续下一次的执行
       break 结束当前的整个循环
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                continue;
            }

            System.out.println("小老虎再吃第"+i+"个包子");
        }

        */
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎再吃第"+i+"个包子");
            if(i==3){
                break;
            }

        }
    }
}