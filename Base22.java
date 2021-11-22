import java.util.*;

//Map接口
//Map 中可以放置键值对，也就是每一个元素都包含键对象和值对象，Map 实现较常用的为
//HashMap，HashMap 对键对象的存取和HashSet 一样，仍然采用的是哈希算法，所以如果使
//用自定类作为Map 的键对象，必须复写equals 和hashCode 方法。
public class Base22 {
    public static void main(String[] args) {
       /* Map map=new HashMap();
        map.put("1001","张三");
        map.put("1002","李四");
        map.put("1003","王五");
//采用entrySet 遍历Map
         Set entrySet=map.entrySet();
         for (Iterator iter=entrySet.iterator();iter.hasNext();){
//             System.out.println(iter.next());
           Map.Entry entry=(Map.Entry)iter.next();
             System.out.println(entry.getKey()+","+entry.getValue());
         }
        System.out.println("");
        //取得map 中指定的key
        Object v=map.get("1003");
        System.out.println("1003=="+v);
        System.out.println("");
        //如果存在相同的条目，会采用此条目替换
        //但map 中始终保持的是不重复的数据
        //主要依靠key 开判断是否重复，和value 没有任何关系
        map.put("1003","赵六");
        //采用keySet 和get 取得map 中的所有数据
        for (Iterator iter=map.keySet().iterator();iter.hasNext();){
            String k=(String)iter.next();
            System.out.println(k+","+map.get(k));
//            HashMap，采用自定义类作为 key

        }*/
        IdCard idCard1=new IdCard(223243244243243L);
        Person4 a=new Person4("张三");
        IdCard idCard2=new IdCard(223243244243244L);
        Person4 b=new Person4("李四");
        IdCard idCard3=new IdCard(223243244243245L);
        Person4 c=new Person4("王五");
        Map map=new HashMap();
        map.put(idCard1,a);
        map.put(idCard2,b);
        map.put(idCard3,c);
       /* Set entrySet=map.entrySet();
        for (Iterator iter=entrySet.iterator();iter.hasNext();){
//            System.out.println(iter.next());
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }*/
        /*for (Iterator iter=map.entrySet().iterator();iter.hasNext();){
            Map.Entry entry=(Map.Entry)iter.next();
            IdCard idCard=(IdCard)entry.getKey();
            Person4 p =(Person4)entry.getValue();
            System.out.println(idCard.cardNo+","+p.name);
        }*/
        for (Iterator iter=map.keySet().iterator();iter.hasNext();){
            IdCard k=(IdCard) iter.next();
            System.out.println(k+","+map.get(k));
        }

    }
}
class IdCard{
    long cardNo;

    public IdCard(long cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "cardNo=" + cardNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCard idCard = (IdCard) o;
        return cardNo == idCard.cardNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNo);
    }
}
class Person4{
    String name;

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                '}';
    }
}
