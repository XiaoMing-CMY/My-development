public class Main {
    public static void main(String[] args) {
        int age=18;
        boolean isAdult=age>=18;
        System.out.println("是否成年："+isAdult);
        double score=85.5;
        boolean ispass=score>=60;
        System.out.println("是否及格："+ispass);
        char grade='B';
        boolean isGrade=grade=='A'||grade=='B';
        //  ||判断
        //只要有一个为true那么就为true
        //只有两边为false时才为false
        System.out.println("是否为A/B："+isGrade);
        boolean hasTicket=true,hasID=false;
        boolean canEnter=hasTicket && hasID;
        //&&必须两个都满足才能运行
        System.out.println("是否能入场:"+canEnter);
        String name="陈明毅";
        String namen2="陈明毅";
        boolean isNamen2=name.equals(namen2);
        //equal为判断是否相同的方法
        //用法：isB=A.equal(B)
        System.out.println("是否相同："+isNamen2);
        //is为布尔中方法的命名
    }
}