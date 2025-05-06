package developmen1;
public class phoneTest1 {
    public static void main(String[] args) {
        phone p=new phone();
        p.brand="华为";
        p.price=3999.99;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
    }
}
