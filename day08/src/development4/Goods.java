package development4;

public class Goods {
    private String ID;
    private String name;
    private double price;
    private int count;
    public  Goods(){}
    public  Goods(String ID, String name, double price, int count) {
        this.ID=ID;
        this.name=name;
        this.price=price;
        this.count=count;
    }
    public void setID(String ID) {
        this.ID=ID;
    }
    public String getID(){
        return ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }
}
