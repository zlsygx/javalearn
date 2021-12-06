import java.io.*;

//对象流
//对象流可以将Java 对象转换成二进制写入磁盘，这个过程通常叫做序列化，并且还可
//以从磁盘读出完整的Java 对象，而这个过程叫做反序列化。
//对象流主要包括：ObjectInputStream 和ObjectOutputStream
//如何实现序列化和反序列化
//如果实现序列化该类必须实现序列化接口java.io.Serializable，该接口没有任何方法，该接口
//只是一种标记接口，标记这个类是可以序列化的
public class Base36 {
    public static void main(String[] args) {
//        序列化
        ObjectOutputStream oop=null;
        try {
            oop=new ObjectOutputStream(new FileOutputStream("zijie5"));
            Person0 p=new Person0("张三");
//            java.io.NotSerializableException: Person0
//	at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1185)
//	at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:349)
//	at Base36.main(Base36.java:16)
            oop.writeObject(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oop != null) {
                try {
                    oop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
//        反序列化
        ObjectInputStream oip=null;
        try {
            oip=new ObjectInputStream(new FileInputStream("zijie5"));
            Person0 p2=(Person0)oip.readObject();
            System.out.println(p2.name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (oip != null) {
                try {
                    oip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
////实现序列化接口
class Person0 implements Serializable{
    String name;

    public Person0(String name) {
        this.name = name;
    }
}