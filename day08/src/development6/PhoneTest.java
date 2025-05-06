package development6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr=new Phone[3];
        Phone p1=new Phone("苹果",10000,"白色");
        Phone p2=new Phone("华为",8000,"黑色");
        Phone p3=new Phone("小米",5000,"红色");
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getPrice();
            System.out.println(arr[i].getBrand()+","+arr[i].getPrice()+","+arr[i].getColor());
        }
        int avg=sum/arr.length;
        System.out.println("平均价格为："+avg);
    }
}
