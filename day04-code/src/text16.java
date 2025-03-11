public class text16 {
    public static void main(String[] args) {
    //定义珠穆朗玛峰的高度
        double height =8844430;
    //定义纸张的厚度
    double paper=0.1;
    //定义折叠次数
    int count=0;
    //循环折叠
    while(paper<height){
        paper=paper*2;
        count++;
    }
        System.out.println(count);
    }
}
