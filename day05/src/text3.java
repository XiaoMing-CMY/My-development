import java.util.Random;
public class text3 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10);
            System.out.println(number);
        }

    }
}
