package development8;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(66, "詹姆斯", 40);
        Student s2 = new Student(77, "陈明毅", 25);
        Student s3 = new Student(88, "韦德", 43);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student(99, "库里", 35);
        boolean flag = contains(arr, s4.getStudentNumber());
        if(flag){
            System.out.println("该学生已存在");
        }else{

        }
    }


    public static boolean contains(Student[] arr, int StudentNumber) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            int STN = s.getStudentNumber();
            if (STN == StudentNumber) {
                return true;
            }
        }
        return false;
    }
}
