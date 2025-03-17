//定义一个方法，求数组中的最大值，返回最大值
public class text22 {
    public static void main(String[] args) {
    //定义一个数组
        int[] arr = {1,2,3,4,5};
    //调用方法
        int max=getMax(arr);
    System.out.println(max);
    }
    //定义方法
    public static int getMax(int[] arr){
        //定义一个变量，用于保存最大值
        int max = arr[0];
        //遍历数组，获取数组中的每一个元素
        for (int i = 1; i < arr.length; i++) {
            //拿数组中的元素和max比较
            //如果数组中的元素大于max，就把数组中的元素赋值给max
            if(arr[i]>max){
                max = arr[i];
                //遍历数组 {1,2,3,4,5}   第一次 2>1  第二次 3>2  第三次 4>3  第四次 5>4  第五次5=5
            }
        }
       //当循环结束后，max中保存的就是数组中的最大值
        //把max返回
        return max;
    }
}
