import com.sun.jdi.PathSearchingVirtualMachine;

public class Base7 {
    public static void main(String[] args) {
      Inter1 interImpl1 =new InterImpl();
      Inter2 interImpi2 =new InterImpl();
      Inter3 interImpl3 =new InterImpl();
      interImpl1.method1();
      interImpi2.method2();
      interImpl3.method3();
      System.out.println("------------------------");
      InterImpl a =(InterImpl)interImpl1;
      a.method1();
      a.method2();
      a.method3();
        System.out.println("===========================");
        StudentOracle studentOracle1 =new StudentOracle();
        studentOracle1.add(2020135007,"张三");
    }
}
interface StudentManger{
    public  void addStudent();
    public abstract void addStudent(int id,String name);
    String ABV ="haha";
    public static final float I =3.14f;
    public void method2();


}
interface A extends StudentManger{
    public void method1();
    public void method2();
}
interface Inter1{
    public void method1();
}
interface Inter2{
    public void method2();

}
interface Inter3{
    public void method3();
}
class InterImpl implements Inter1,Inter2,Inter3{
    @Override
    public void method1() {
        System.out.println("------------1----------------");
    }

    @Override
    public void method2() {
        System.out.println("============2===================");
    }

    @Override
    public void method3() {
        System.out.println("-----------------------3--------");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
 class StudentOracle{
    public void add(int id,String name){
        System.out.println("StudentOracle.add()");
    }
}
