//九九乘法表
public class leetcode2 {
    public static void main(String[] args) {
        int product=0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1;  j<= i; j++) {
                product=i*j;
                System.out.print(i+"*"+j+"="+product+ "\t");
            }
            System.out.println();


        }
    }
}
