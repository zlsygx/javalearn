public class Base4 {
    public static void main(String[] args) {
//    创建一个对象
        Student a = new Student();
//    给对象赋值
        a.setName("张三");
        a.setAddress("123456789");
        a.setAge(132);
        a.setNo(2020135007);
        a.setSex("男");
//    输出新赋值的对象
        System.out.println(a.getNo());
        System.out.println(a.getSex());
        System.out.println(a.getAddress());
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
class Student{
//    学号
    private int no;
//    姓名
    private String name;
//    性别
    private String sex;
//    地址
    private String address;
//    年龄
    private int age;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no) {
        this.no = no;
    }

    public Student(int no, String name, String sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    public Student(int no, String name, String sex, String address, int age) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
    }

    public Student(int no, String name, String sex, String address) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <=0||age >=120){
            throw new RuntimeException("年龄不合法，请重新输入");
        }else{
            this.age = age;
        }

    }
}
