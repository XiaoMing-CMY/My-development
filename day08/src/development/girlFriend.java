package development;
public class girlFriend {
    private String name;
    private int age;
    private double height;
    private String gender;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>=18&&age<=50){
            this.age=age;
        }else{
            System.out.println("输入的年龄不合法");
        }
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double height){
        if(height>=165.5&&height<=175.5){
            this.height=height;
        }else{
            System.out.println("输入的身高不合法");
        }
    }
    public double getHeight(){
        return height;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
