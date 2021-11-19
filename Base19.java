import java.util.*;

//LinkedList
public class Base19 {
    public static void main(String[] args) {
        List a=new LinkedList();
        a.add(5);
        a.add(2);
        a.add(4);
        a.add(2);
        a.add(7);
        a.add(9);
        a.add(10);
        for (int i=0;i<a.size();i++){
            Integer v=(Integer)a.get(i);
            System.out.println(v);
            System.out.println("");
            System.out.println((Integer)a.get(i));

        }
        System.out.println("");
        a.remove(0);
        Iterator b=a.iterator();
        while (b.hasNext()){
            System.out.println((Integer)b.next());
        }
        System.out.println("");
        for (Iterator iter3=a.iterator();iter3.hasNext();){
            System.out.println((Integer)iter3.next());
        }
        System.out.println(a.isEmpty());
        System.out.println(a.contains(2));
        System.out.println("");
        Object[] oarry=a.toArray();
        for (int i=0;i<oarry.length;i++){
            System.out.println(oarry[i]);
        }
        System.out.println("");
        Integer[] iteg=new Integer[a.size()];
        a.toArray(iteg);
        for (int i=0;i<iteg.length;i++){
            System.out.println(iteg[i]);
        }
        System.out.println("");
        Collection c=new HashSet();
        c.add(2);
        c.add(2);
        c.add("a");
        c.add(1);
        Iterator m=c.iterator();
        while (m.hasNext()){
            System.out.println(m.next());
        }
        System.out.println(c.contains("a"));
        System.out.println(c.isEmpty());
        System.out.println("");
        Object[] n=c.toArray();
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }
}
