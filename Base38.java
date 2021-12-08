import java.io.*;

//关于serialVersionUID 属性
//在person 中加入一个成员属性sex，然后在读取person.dat 文件
public class Base38 {
    public static void main(String[] args) {
//        writeObject();
        readObject();

    }
    private static void readObject(){
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("zijie9"));
            Person8 person=(Person8)ois.readObject();
            System.out.println(person.name);
            System.out.println(person.age);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
   /* private static void writeObject(){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("zijie9"));
            Person8 person=new Person8("张三",22);
            oos.writeObject(person);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }*/
}
//实现序列化接口
class Person8 implements Serializable{
    //加入版本号，防止序列化兼容问题
    private static final long serialVersionUID=-111111111111111111L;
    String name;
    int age;
    boolean sex;

    public Person8() {
    }

    public Person8(String name, int age ) {
        this.name = name;
        this.age = age;
    }
}