package Test;

public class bookTest {
    public static void main(String[] args) {

        book b=new book();
        b.setTitle("java");
        b.setPrice(39.9);
        b.displayInfo();
        b.discount(1.5);
        System.out.println("折扣后价格："+b.getPrice());
    }
}
