import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//集合/List接口
public class Base18 {
    public static void main(String[] args) {
        //最好不要这样写，这样属于面向具体编程了
        //无法达到灵活互换
//        ArrayList arrayList=new ArrayList();
        //采用面向接口编程
       //使用Collection 会更灵活，如果List 不能满足要求
      //那么可以采用HashSet，因为HashSet 也实现了该接口
        Collection c=new ArrayList();
        //面向接口编程
        //采用list 接口可以使用Collection 里的方法
       //也可以使用list 接口扩展的方法
        List o=new ArrayList();
        //自动装箱，适合于jdk1.5
        o.add(1);
        o.add(2);
        o.add(new Integer(1));
        o.add(2);
        //不能加入字符串
        //在强制转换时会出现ClassCastException 错误
        //可以采用List 接口的中get()方法依次取得元素
        //输出结果为,不会打乱顺序
        for (int i=0;i<o.size();i++){
            Integer e=(Integer)o.get(i);
            System.out.println(e);
        }
        System.out.println("");
        //调用remove 删除集合中的元素
        //如果元素重复会remove 掉第一个匹配的
//        o.remove(1);
        //采用Iterator 遍历数据（while 循环）
        o.remove(0);
        //Iterator 是一种模式，主要可以统一数据结构的访问方式
        //这样在程序中就不用关心各个数据结构的实现了
        //使对不同数据结构的遍历更加简单了，更加统一了
        Iterator iter=o.iterator();
        while (iter.hasNext()){
             Integer v=(Integer)iter.next();
            System.out.println(v);
        }
        System.out.println("");
        for (Iterator iter1=o.iterator();iter1.hasNext();){
            Integer v=(Integer)iter1.next();
            System.out.println(v);
        }
        System.out.println(o.contains(2));
        System.out.println(o.isEmpty());
        System.out.println("");
        //转换成对象数组
        Object[] oArray1=o.toArray();
        for (int i=0;i<oArray1.length;i++){
            System.out.println(oArray1[i]);

        }
        System.out.println("");
        //运行时自动创建相应类型的数组
        Integer[] iArray=new Integer[o.size()];
        o.toArray(iArray);
        for (int i=0;i<oArray1.length;i++){
            System.out.println(oArray1[i]);
        }
        o.toArray(new Integer[o.size()]);
    }
}
