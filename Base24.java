import java.util.*;

//Collections工具类
//Collections 位于java.util 包中，提供了一系列实用的方法，如：对集合排序，对集合中的内
//容查找等
public class Base24 {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(2);
        l.add(1);
        l.add(5);
        l.add(9);
        l.add(10);
        for (Iterator iter=l.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("");
        Collections.sort(l);
        for (Iterator iter=l.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("");
        Set set=new HashSet();
        set.add(10);
        set.add(7);
        set.add(6);
        set.add(3);
        //不能直接对set 排序
      /*  Error:(28, 20) java: 对于sort(java.util.Set), 找不到合适的方法
        方法 java.util.Collections.<T>sort(java.util.List<T>)不适用
                (无法推断类型变量 T
                        (参数不匹配; java.util.Set无法转换为java.util.List<T>))
        方法 java.util.Collections.<T>sort(java.util.List<T>,java.util.Comparator<? super T>)不适用
                (无法推断类型变量 T
                        (实际参数列表和形式参数列表长度不同))
        Collections.sort(set);*/
        List listSet=new ArrayList(set);
        Collections.sort(listSet);
        for (Iterator iter=listSet.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("");
        int index=Collections.binarySearch(listSet,6);
        System.out.println("index="+index);
        System.out.println("");
//        逆序输出排序
        Collections.reverse(listSet);
        for (Iterator iter=listSet.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
