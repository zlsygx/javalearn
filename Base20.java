import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//HashSet
public class Base20 {
    public static void main(String[] args) {
//HashSet 中的数据是无序的不可重复的。HashSet 按照哈希算法存取数据的，具有非常好性
//能，它的工作原理是这样的，当向HashSet 中插入数据的时候，他会调用对象的hashCode
//得到该对象的哈希码，然后根据哈希码计算出该对象插入到集合中的位置。
        Set set=new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        for (Iterator iter=set.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
//        加入重复的的数据
        set.add("a");
        for (Iterator iter=set.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("");
        String s1="abc";
        String s2="abc";
        System.out.println("s1.equalss2   "+ s1.equals(s2));
        //equals 相等，hashcode 一定是相等的
        System.out.println("s1.hashCode()="+s1.hashCode());
        System.out.println("s2.hashCode()="+s2.hashCode());
        String s3="dddddd";
        System.out.println("s1.equals(s3)    "+s1.equals(s3));
        System.out.println("s3.hashCode()="+s3.hashCode());
        System.out.println("");
//        equals和 hashCode
       /* Person2 a=new Person2("张三",25);
        Person2 b=new Person2("李四",25);
        Person2 c=new Person2("张三",32);
        Set set1=new HashSet();
        set1.add(a);
        set1.add(b);
        set1.add(c);
        for (Iterator iter=set1.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("a.hashCode()="+a.hashCode());
        System.out.println("b.hashCode()="+b.hashCode());
        System.out.println("c.hashCode()="+c.hashCode());*/
//加入了重复的数据，因为hashCode 是不同的，所以会根据算出不同的位置，存储格式
//        进一步完善，覆盖equals
        Person2 a=new Person2("张三",25);
        Person2 b=new Person2("李四",25);
        Person2 c=new Person2("张三",32);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        Set set1=new HashSet();
        set1.add(a);
        set1.add(b);
        set1.add(c);

        for (Iterator iter=set1.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("a.hashCode()="+a.hashCode());
        System.out.println("b.hashCode()="+b.hashCode());
        System.out.println("c.hashCode()="+c.hashCode());

    }
}
class Person2{
    String name;
    int age;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

   /* @Override
    public String toString() {
        return "name="+this.name+"，age="+this.age+"";
    }*/

   /* @Override
    public boolean equals(Object obj) {
        if (this==obj)  return true;
        if (obj instanceof Person2){
            Person2 p=(Person2)obj;
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name==null)?0:name.hashCode();
    }*/
//再次强调：特别是向 HashSet或HashMap 中加入数据时必须同时覆盖 equals和 hashCode
//方法，应该养成一种习惯覆盖 equals的同时最好同时覆盖 hashCode
//Java 要求：
//两个对象equals 相等，那么它的hashcode 相等
//两个对象equals 不相等，那么它的hashcode 并不要求它不相等，但一般建议不相等
//hashcode 相等不代表两个对象相等（采用equals 比较）


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
