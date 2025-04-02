public class text6 {
    public static void main(String[] args) {
        //复制数组中的内容
        int[] arr={1,2,3,4,5};
        int[] newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        System.out.print("{");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i];
            if(i<newArr.length-1){
                System.out.print(newArr[i]+", ");
            }else{
                System.out.print(newArr[i]);
            }
        }
        System.out.println("}");
        if(newArr.length==arr.length){
            boolean flag=true;
            for (int i = 0; i < newArr.length; i++) {
                if(newArr[i]!=arr[i]){
                    flag=false;
                    break;
                }
            }
            System.out.println(flag);
        }
    }
}
