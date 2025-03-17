
import java.util.Random;

public class text10 {
    public static void main(String[] args) {
    Random rand=new Random();
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
        int number=rand.nextInt(100)+1;
        array[i]=number;
    }
    int sum=0;
    for(int i=0;i<array.length;i++){
        sum+=array[i];
    }

    int avg=sum/array.length;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<avg){
                count++;
            }
        }
    System.out.println("数组元素的和为"+sum);
    System.out.println("数组元素的平均值为"+avg);
    System.out.println("数组中小于平均值的元素个数为"+count);
    }
    }


