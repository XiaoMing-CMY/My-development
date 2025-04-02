import java.util.Random;
import java.util.Scanner;

public class text13 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("==================");
        int[] userIputNumber = usernumber();
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userIputNumber.length - 1; i++) {
            int redNumber = userIputNumber[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == redNumber) {
                    redCount++;
                    break;
                }
            }
        }
        int blueNumber = userIputNumber[userIputNumber.length - 1];
        if (blueNumber ==arr[arr.length - 1] ) {
            blueCount++;
        }
        if(redCount==6&&blueCount==1){
            System.out.println("恭喜您中1000万！");
        }else if(redCount==6&&blueCount==0) {
            System.out.println("恭喜您中500万！");
        }else if(redCount==5&&blueCount==1) {
            System.out.println("恭喜您中3000元！");
        }else if((redCount==5&&blueCount==0)||(redCount==4&&blueCount==1)){
            System.out.println("恭喜您中200元！");
        }else if((redCount==4&&blueCount==0)||(redCount==3&&blueCount==1)){
            System.out.println("恭喜您中10元！");
        }else if((redCount==2&&blueCount==1)||(redCount==1&&blueCount==1)||(redCount==0&&blueCount==1)){
            System.out.println("恭喜您中5元！");
        }else{
            System.out.println("很遗憾，没有中奖！");
        }
    }

    public static int[] usernumber(){
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码：");
            int redNumber=sc.nextInt();
            if(redNumber>=1&&redNumber<=33){
                boolean flag=contains(arr,redNumber);
                if(!flag) {
                    arr[i]=redNumber;
                    i++;
                }else{
                    System.out.println("输入有误，请重新输入");
                }

            }else{
                System.out.println("输入有误，请重新输入");
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("请输入蓝球号码：");
            int blueNumber=sc.nextInt();
            if(blueNumber>=1&&blueNumber<=16){
                arr[arr.length-1]=blueNumber;
                break;
            }else{
                System.out.println("输入有误，请重新输入");
            }
        }
        return arr;
    }
    public static int[] createNumber(){
        int[] arr=new int[7];
        Random r=new Random();
        for (int i = 0; i < 6; ) {
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
