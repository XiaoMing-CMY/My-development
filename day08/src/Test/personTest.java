package Test;

public class personTest {
    public static void main(String[] args) {
        person p=new person("小明",24);
        System.out.println("姓名："+p.getName());
        System.out.println("年龄："+p.getAge());
        p.setName("小朱");
        p.setAge(25);
        p.introduce();
    }
}
