public class Base6 {
//    方法的覆盖和对父类方法的重写
    public static void main(String[] args) {
       Person1 a =new Student1();
       a.printf();
       Student1 b =(Student1)a;
       b.printf1();

}
}
class Person1{
    private int id;
    private String name;
    private String adress;
    private int age;
    private boolean sex;

    public Person1() {
        System.out.println("===========Person===============");
    }

    public Person1(int id, String name, String adress, int age, boolean sex) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <=120){
            this.age = age;
        }

    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void printf(){
        System.out.println("id="+id+",name="+name+",sex="+sex+
                ",adress="+adress+",age="+age);
    }

}
class Student1 extends Person1{
    private int classId;

    public Student1() {
        System.out.println("==========Student1=========");
    }

    public Student1(int id, String name, String adress, int age, boolean sex, int classId) {
        super(id, name, adress, age, sex);
        this.classId = classId;
    }

    @Override
    public void printf() {
        System.out.println("会调用这个方法么");
    }
    public void printf1(){
        System.out.println("这个方法呢");
    }

}
//    采用final修饰的类不能被继承
/*final class A{

}
class B extends A{

}*/
/* class A{
public final void print2(){

}
}
class B extends A{
     public void print2(){

     }
}*/
//采用 final 修饰的变量(基本类型)不能被修改
//


