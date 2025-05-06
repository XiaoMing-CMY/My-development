package develoment2;

public class girlFriend {
    private String name;
    private int age;
    private String gender;
    public girlFriend() {
        System.out.println("看看我执行了吗？");
    }
    public girlFriend(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
}
