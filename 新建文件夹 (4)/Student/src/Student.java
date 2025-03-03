public class Student {
    // 成员变量（字段）
    private String name;  // 学生姓名，使用private封装
    private int age = 18; // 学生年龄，默认值18（若构造方法不传age则用此值）

    // 构造方法：初始化name和age
    public Student(String name, int age) {  // 添加age参数
        this.name = name;
        this.age = age;  // 新增对age的赋值
    }

    // 方法：打印学生信息
    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age);  // 优化输出格式
    }
}