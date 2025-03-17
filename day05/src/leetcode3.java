//阶乘
public class leetcode3 {
    public static void main(String[] args) {
        int number = 5;
        int end = 1;
        int result = 1;
        while (end <= number) {
            result = result*end;
            end++;
        }
        System.out.println(result);
    }
}
