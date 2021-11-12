import java.util.Objects;

//引用类型的数组/二维数组的遍历两种方式
public class Base12 {
    public static void main(String[] args) {
        Student2[] student2 = new Student2[3];
//出现空指针异常
//    student2[0].setId(1001);
        Student2 a = new Student2("张三",1001);
        student2[0] =a;
        System.out.println(student2[0].getName());
        System.out.println("=============================");
//        二维数组的创建
        int[][] erweiarry =new int[2][3];
//        对二维数组进行赋值
        erweiarry[0][0]=1;
        erweiarry[0][1]=2;
        erweiarry[0][2]=3;
        erweiarry[1][0]=4;
        erweiarry[1][1]=5;
        erweiarry[1][2]=6;
//        对二维数组进行遍历
        for (int i=0;i<erweiarry.length;i++){
            for (int j=0;j<erweiarry[i].length;j++){
                System.out.print(erweiarry[i][j]);
            }
            System.out.println();

        }
        System.out.println("---------------------");
        for (int[] abcd :erweiarry){
           /* for (int cdef :abcd){
                System.out.println(cdef);
            }*/
            System.out.println(abcd[0]);

        }
    }
}

class Student2{
    private String name;
    private int id;

    public Student2() {
    }

    public Student2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return id == student2.id &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';

    }
}