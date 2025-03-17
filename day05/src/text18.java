import javax.xml.transform.Result;

public class text18 {
    public static void main(String[] args) {
        double sum1= sum(11, 20, 59);
        double sum2= sum(12, 20.5, 59.6);
        double sum3= sum(18.6, 20.9, 55.9);
        double sum4= sum(15.8, 20.8, 60.5);
        double all = sum1+sum2+sum3+sum4;
        System.out.println(all);
    }
    public static double sum(double a, double b,double c) {
        double result = a + b + c;
        return result;
    }
}
