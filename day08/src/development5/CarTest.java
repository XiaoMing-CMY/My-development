package development5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr=new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c=new Car();
            System.out.println("请输入品牌：");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入价格：");
            double price=sc.nextDouble();
            c.setPrice(price);
            System.out.println("请输入颜色：");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car=arr[i];
            System.out.println(car.getBrand()+" "+car.getPrice()+" "+car.getColor());
        }
    }
}
