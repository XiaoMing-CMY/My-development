package development;

public class girlFriedTest1 {
    public static void main(String[] args) {
        girlFriend gf1=new girlFriend();
        gf1.setName("迪丽热巴");
        gf1.setAge(18);
        gf1.setHeight(175.5);
        gf1.setGender("女");
        System.out.println("我的女朋友是："+gf1.getName());
        System.out.println("年龄："+gf1.getAge());
        System.out.println("身高："+gf1.getHeight());
        System.out.println("性别："+gf1.getGender());
        gf1.sleep();
        gf1.eat();
    }
}
