import java.util.Random;

public class text12 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        //随机数生成器
        Random random = new Random();
        //遍历数组
        for(int i=0;i<arr.length;i++){
            //生成随机数
            int index = random.nextInt(arr.length);
            //交换位置  创建一个临时变量记录arr[i]的值    把arr[index]的值赋值给arr[i]  把临时变量的值赋值给arr[index]
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
