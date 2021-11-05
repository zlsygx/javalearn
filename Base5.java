public class Base5 {
    public static int age =100;
    public static void main(String[] args) {
        Base5 base1 =new Base5();
        System.out.println(Base5.age);
        Sinleton.getInstance().test();
        Students a =new Students();
        a.setName("张三");
        a.setName("李四");
        a.setClassId(2020135);
        a.setId(2020135007);
        a.setAdress("长安大学雁塔校区");
        a.setAge(23);
        a.setSex(true);
        System.out.println(a.getName());
        System.out.println(a.getSex()?"男":"女");
        System.out.println(a.getClassId());
        System.out.println(a.getAge());
        System.out.println(a.getAdress());
        System.out.println(a.getId());
        System.out.println("==============================");
        Employee b =new Employee("王五",true,"长安大学",30,10);
        System.out.println(b.getName());
        System.out.println(b.getSex()?"男":"女");
        System.out.println(b.getAge());
        System.out.println(b.getAdress());
        System.out.println(b.getWorkTime());

    }
}
class Sinleton{
    private static Sinleton instance = new Sinleton();
    private Sinleton(){

    }
    public static Sinleton getInstance(){
        return instance;
    }
    public void test(){
        System.out.println("-----------test---------");
    }
}
class Person{
    private String name;
    private boolean sex;
    private String adress;
    private int age;

    public Person() {
    }

    public Person(String name, boolean sex, String adress, int age) {
        this.name = name;
        this.sex = sex;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
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
}
class Students extends Person{
    private int id;
    private int classId;

    public Students() {
    }

    public Students(String name, boolean sex, String adress, int age, int id, int classId) {
        super(name, sex, adress, age);
        this.id = id;
        this.classId = classId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
class Employee extends Person{
    private int workTime;

    public Employee(String name, boolean sex, String adress, int age, int workTime) {
        super(name, sex, adress, age);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}