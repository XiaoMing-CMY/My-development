package studentSystem;

public class user {
    private String userName;
    private String passWord;
    private String idNumber;
    private String phoneNumber;
    public user(){}
    public user(String userName,String passWord,String idNumber){
        this.userName=userName;
        this.passWord=passWord;
        this.idNumber=idNumber;
        this.phoneNumber=phoneNumber;
    }
    public void setuserName(String userName){
        this.userName=userName;
    }
    public String getuserName(){
        return userName;
    }
    public void setPassWord(String passWord){
        this.passWord=passWord;
    }
    public String getPassWord(){
        return passWord;
    }
    public void setIdNumber(String idNumber){
        this.idNumber=idNumber;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
