import java.util.*;

//泛型初步
//泛型能更早的发现错误，如类型转换错误，通常在运行期才会发现，如果使用泛型，那么在
//编译期将会发现，通常错误发现的越早，越容易调试，越容易减少成本
public class Base25 {
    public static void main(String[] args) {
//        示例一
//        List list=new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for (Iterator iter=list.iterator();iter.hasNext();){
//             String abc=(String)iter.next();
////  Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
////	at Base25.main(Base25.java:15)
//            System.out.println(abc);
//        }
//        使用泛型解决示例一
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //不能将abc 放到集合中，因为使用泛型，在编译器就可以返现错误
//        list.add("abc");
        for (Iterator<Integer> iter=list.iterator();iter.hasNext();) {
//因为使用泛型，在编译器就可以发现错误
//            String abc = (String) iter.next();
            //使用泛型可以不用进行强制转换
//         Integer s = (Integer)iter.next();
//            System.out.println(iter.next());
            //可以直接取得相应的元素，使用泛型返回的是真正的类型
            Integer s = iter.next();
            System.out.println(s);
        }
//        采用泛型来改善自定义比较器
        Person5 p1 = new Person5();
        p1.name = "张三";
        p1.age = 20;
        Person5 p3 = new Person5();
        p3.name = "张三";
        p3.age = 40;
        Person5 p2 = new Person5();
        p2.name = "李四";
        p2.age = 30;
        Set<Person5> set = new TreeSet<Person5>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        for (Iterator<Person5> iter=set.iterator(); iter.hasNext();) {
            Person5 p = iter.next();
            System.out.println("name=" + p.name + ", age=" + p.age);
        }

    }
}
class Person5 implements Comparable<Person5>{
    int age;
    String name;
    //使用了泛型类似的instanceof 就不用再写了
    @Override
    public int compareTo(Person5 o) {
        return this.age-o.age;
    }

}
