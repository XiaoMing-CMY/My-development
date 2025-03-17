public class text11 {
    public static void main(String[] args) {
    //定义一个数组
        int[] arr={1,2,3,4,5};
        //创建一个for循环，实现数组的反转
        //定义两个变量，一个变量代表数组的开始，一个变量代表数组的结束
        //因为数组的下标是从0开始的，所以数组的最后一个元素的下标是arr.length-1
        //定义一个中间变量，用于交换两个变量的值
        //循环结束的条件是两个变量的值相等
        //循环体中的内容是交换两个变量的值
        //循环结束后，打印数组
    for(int i=0,j=arr.length-1;i<j;i++,j--){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    }
}
