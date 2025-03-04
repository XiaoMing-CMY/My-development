public class Main {
    public static void main(String[] a) {
        int num=50;
        //总共五十人
        int specialPeople=7;
        //这七个人没有进行握手
        int Handshake=num-specialPeople;
        int normalPeople=Handshake*(Handshake-1)/2;
        int fornormalPeople=normalPeople*specialPeople;
        int numPeople=normalPeople+fornormalPeople;
        System.out.println("总共握手为："+numPeople);

    }
}