public class text8 {
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==1){
                arr[i]=arr[i]*2;
            }
            else{
                arr[i]=arr[i]/2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
