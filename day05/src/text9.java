public class text9 {
    public static void main(String[] args) {
        int[] arr = {66,88,99,50,100};
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
