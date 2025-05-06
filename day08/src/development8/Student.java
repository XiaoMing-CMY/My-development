package development8;

public class Student {
    private int StudentNumber;
    private String name;
    private int age;
    public Student(){}
    public Student(int StudentNumber,String name,int age){
        this.StudentNumber=StudentNumber;
        this.name=name;
        this.age=age;
    }
    public void setStudentNumber(int StudentNumber){
        this.StudentNumber=StudentNumber;
    }
    public int getStudentNumber(){
        return StudentNumber;
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
}
