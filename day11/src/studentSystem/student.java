package studentSystem;

public class student {
    private String id;
    private String name;
    private int age;
    private String address;
    public student(){}
    public student(String id,String name,int age,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
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
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
}
