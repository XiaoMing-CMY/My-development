package development7;

public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend[] arr=new girlFriend[4];
        girlFriend gf1=new girlFriend("迪丽热巴",34,"女","打篮球");
        girlFriend gf2=new girlFriend("Angelababy",35,"女","踢足球");
        girlFriend gf3=new girlFriend("杨幂",26,"女","爬山");
        girlFriend gf4=new girlFriend("zz",25,"女","打麻将");
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            girlFriend gf=arr[i];
            sum=sum+arr[i].getAge();
            System.out.println(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getGender()+" "+arr[i].getHobby());
        }
        int avg=sum/arr.length;
        System.out.println("平均年龄为："+avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            girlFriend gf=arr[i];
            if(arr[i].getAge()<avg){
                System.out.println("年龄小于平均年龄的是："+arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getGender()+" "+arr[i].getHobby());
                count++;
            }
        }
        System.out.println("总共有："+count);
    }
}
