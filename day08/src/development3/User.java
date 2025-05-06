package development3;

public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public String getPassWord() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void downLoad() {
        System.out.println("注册成功！");
    }

    public void setPassword1(String password1) {
        this.password = password1;
    }

    public String getPassword1() {
        return password;
    }
}
