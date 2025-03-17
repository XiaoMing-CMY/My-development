public class text5 {
    public static void main(String[] args) {
    int[] array = {22, 24, 23, 24, 25, 26, 27, 18, 19, 20};
    double[] arr2 = {181, 182, 183, 184, 185, 186, 187, 188, 189, 190};
    String[] arr3 = {"张三", "李四", "王五", "赵六", "钱七", "孙八", "周九", "吴十", "郑十一", "冯十二"};
        for (int i = 0; i < array.length; i++) {
            System.out.println("姓名："+arr3[i] + " " +"年龄："+ array[i] + " " + "身高："+arr2[i]);
        }

    }
}
