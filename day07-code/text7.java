import java.util.Scanner;

public class text7 {
    public static void main(String[] args) {

        int[] scoreArr=getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max=getMax(scoreArr);
        System.out.println("最高分是："+max);
int min=getMin(scoreArr);
        System.out.println("最低分是："+min);
        int sum=getSum(scoreArr);
        int avg=(sum-max-min)/(scoreArr.length-2);
        System.out.println("最后得分是："+avg);
    }

    public static int[] getScores(){
        int[] scores=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第"+(i+1)+"位评委的打分：");
            int score=sc.nextInt();
            if(score>=0&&score<=100){
                scores[i]=score;
                i++;
            }else{
                System.out.println("输入错误，请重新输入：");
            }
        }
        return scores;
    }
    public static int getMax(int[] score){
        int max=score[0];
        for (int i = 0; i < score.length; i++) {
            if(score[i]>max){
                max=score[i];
        }

        }
        return max;
    }
    public static int getMin(int[] score){
        int min=score[0];
        for (int i = 0; i < score.length; i++) {
            if(score[i]<min){
                min=score[i];
        }

        }
        return min;
    }
public static int getSum(int[] score){
        int sum=0;
    for (int i = 0; i < score.length; i++) {
        sum+=score[i];
    }
    return sum;
}
}
