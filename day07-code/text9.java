
//将整数放进数组中
public class text9 {
    public static void main(String[] args) {
        int number=1983;
        int temp=number;
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        int[] arr=new int[count];
        int index=arr.length-1;
        while(temp!=0){
            int ge=temp%10;
            temp=temp/10;
            arr[index]=ge;
            index--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+5;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]%10;
        }
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int org=arr[i];
            arr[i]=arr[j];
            arr[j]=org;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
