package Arraylist;

public class user {
    private int id;
    private String username;
    private String password;
    public user(){}
    public user(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setUserName(String username){
        this.username=username;
    }
    public String getUserName(){
        return username;
    }
    public void setPassWord(String password){
        this.password=password;
    }
    public String getPassWord(){
        return password;
    }
}
