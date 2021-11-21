import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//TreeSet
public class Base21 {
    public static void main(String[] args) {
// TreeSet 可以对Set 集合进行排序，默认自然排序（即升序），但也可以做客户化的排序
//        Set set=new TreeSet();
       /* set.add(9);
        set.add(8);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(6);
//        不能加入abc，加入后无法排序
//排序只能对一种类型排序
//        set.add("abc");
        for (Iterator itor = set.iterator(); itor.hasNext();){
            System.out.println(itor.next());
        }*/
//        对Person 进行自然排序
     /* Person3 a=new Person3("张三",27);
        Person3 b=new Person3("李四",25);
        Person3 c=new Person3("王五",20);
        set.add(a);
        set.add(b);
        set.add(c);
       *//* 出现错误，因为放到TreeSet 中TreeSet 会对其进行排序，那么必须实现Comparable 接口，
        而我们的Person 没有实现，所以出现了错误，如：基本类型的包装类和String 他们都是可
        以排序的，他们都实现Comparable 接口*//*
        for (Iterator itor = set.iterator(); itor.hasNext();){
            System.out.println(itor.next());
        }*/
//   实现Comparator接口完成排序
        /*Person3 a=new Person3("张三",27);
        Person3 b=new Person3("李四",25);
        Person3 c=new Person3("王五",20);
        Set set=new TreeSet(new PersonComparator());
        set.add(a);
        set.add(b);
        set.add(c);
        for (Iterator itor = set.iterator(); itor.hasNext();){
            System.out.println(itor.next());
        }*/
//        采用匿名类完成Comparator的实现
        Person3 a=new Person3("张三",27);
        Person3 b=new Person3("李四",25);
        Person3 c=new Person3("王五",20);
        Set set=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (!(o1 instanceof Person3)){
                    throw new IllegalArgumentException("非法参数o1="+o1);
                }
                if (!(o2 instanceof Person3)){
                    throw new IllegalArgumentException("非法参数o2="+o1);
                }
                Person3 p1=(Person3)o1;
                Person3 p2=(Person3)o2;
                return p2.age-p1.age;
            }
        });
        set.add(a);
        set.add(b);
        set.add(c);
        for (Iterator itor = set.iterator(); itor.hasNext();){
            System.out.println(itor.next());
        }
    }
}
//实现Comparable接口完成排序
/*class Person3{
    String name;
    int age;

    public Person3() {
    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}*/
/*class Person3 implements Comparable {
    String name;
    int age;

    public Person3() {
    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person3){
            Person3 p=(Person3)o;
//            return (this.age-p.age);
            return (p.age-this.age);

        }
        throw new IllegalArgumentException("非法参数，o="+o);
    }
}*/
class Person3{
    String name;
    int age;

    public Person3() {
    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//实现Person 的比较器
//Comparator 和Comparable 的区别？
//Comparable 是默认的比较接口，Comparable 和需要比较的对象紧密结合到一起了
//Comparator 可以分离比较规则，所以它更具灵活性
/*class PersonComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Person3)){
            throw new IllegalArgumentException("非法参数o1="+o1);
        }
        if (!(o2 instanceof Person3)){
            throw new IllegalArgumentException("非法参数o2="+o1);
        }
        Person3 p1=(Person3)o1;
        Person3 p2=(Person3)o2;
        return p1.age-p2.age;

    }
}*/
//一个类实现了Camparable 接口则表明这个类的对象之间是可以相互比较的，这个类对象组
//成的集合就可以直接使用sort 方法排序。
//Comparator 可以看成一种算法的实现，将算法和数据分离，Comparator 也可以在下面两种环
//境下使用：
//1、类的没有考虑到比较问题而没有实现Comparable，可以通过Comparator 来实现排序而不
//必改变对象本身
//2、可以使用多种排序标准，比如升序、降序等
