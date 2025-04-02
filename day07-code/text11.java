import java.util.Random;

public class text11 {
    public static void main(String[] args) {
        int[] arr={2,588,888,100,1000,10000};
        int[] newArr=new int[arr.length];
        Random r=new Random();
        for (int i = 0; i < 6; ) {
            int randomIndex=r.nextInt(arr.length);
            int prize=arr[randomIndex];
            boolean flag=contains(newArr,prize);
            if(!flag){
                newArr[i]=prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("恭喜您中"+newArr[i]+"元");
        }
    }
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}
