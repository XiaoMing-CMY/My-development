public class text14 {
    public static void main(String[] args) {
       /* for(int i =1;i<=5;i++){
            System.out.println("断线重连"+i+"次");
        }

        */
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
