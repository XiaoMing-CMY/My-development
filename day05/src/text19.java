public class text19 {
    public static void main(String[] args) {
        double area1 = area(10.0, 5.0);
        System.out.println("第一个长方形的面积为："+area1);
        double area2 = area(10.0, 5.0);
        System.out.println("第二个长方形的面积为："+area2);
        if(area1==area2){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }

    }
    public static double area(double length,double width) {
        double area=length*width;
        return area;
    }
}
