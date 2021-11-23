import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//TreeMap
//treeMap 可以对Map 中的key 进行排序，如果map 中的key 采用的是自定类那么需要实现
//Comaprable 或Comparator 接口完成排序
public class Base23 {
    public static void main(String[] args) {
        Map map=new TreeMap();
        map.put("1001","张三");
        map.put("1004","李四");
        map.put("1003","王五");
        map.put("1002","刘柳");
       /* for (Iterator iter=map.keySet().iterator();iter.hasNext();){
            String v=(String)iter.next();
            System.out.println(v+","+map.get(v));
        }*/
        for (Iterator iter=map.entrySet().iterator();iter.hasNext();){
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
