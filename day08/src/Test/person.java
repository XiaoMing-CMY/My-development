package Test;

public class person {
    private String name;
    private int age;
    public person() {}
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void introduce(){
        System.out.println("我的名字是："+name+",我今年"+age+"岁了");
    }
}
