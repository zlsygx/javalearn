import java.io.*;

//关于transient 关键字
public class Base37 {
    public static void main(String[] args) {
        writeObject();
        readObject();

    }
    private static void readObject(){
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("zijie7"));
            //反序列化
            Person7 person=(Person7)ois.readObject();
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
    private static void writeObject(){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("zijie7"));
            Person7 person=new Person7("张三",20);
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
    }

}
//实现序列化接口
class Person7 implements Serializable{
    String name;
    //采用transient 关键字修饰此属性，序列化时会忽略
    transient int age;

    public Person7() {
    }

    public Person7(String name, int age) {
        this.name = name;
        this.age = age;
    }
}