package development4;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("001","华为mate70",4999,50);
        Goods g2=new Goods("002","保温杯",299,100);
        Goods g3=new Goods("003","枸杞",19.9,100);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getPrice()+" "+arr[i].getCount());
        }

    }
}
