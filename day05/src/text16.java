//调用带参方法求矩形的周长

public class text16 {
    public static void main(String[] args) {
        getLength(5.5,4.5);
    }
    public static void getLength(double len,double width){
        double result =(len+width)*2;
        System.out.println(result);
    }
}
