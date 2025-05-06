package Test;

public class book {
    private String title;
    private double price;
    public book(){}
    public book(String title,double price){
        this.title=title;
        this.price=price;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.println("书名："+title+"价格"+price+"元");
    }
    public void discount(double discount){
        price=price*discount;
    }
}
