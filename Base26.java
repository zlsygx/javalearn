import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

//采用泛型改造 Map
public class Base26<T> {
    /*public static void main(String[] args) {
        Card a=new Card(2020135006);
        Person6 p1=new Person6("张三");
        Card b=new Card(2020135007);
        Person6 p2=new Person6("李四");
        Card c=new Card(2020135008);
        Person6 p3=new Person6("王五");
        Map<Card,Person6> map=new HashMap<Card,Person6>();
        map.put(a,p1);
        map.put(b,p2);
        map.put(c,p3);
        for (Iterator<Map.Entry<Card,Person6>> iter=map.entrySet().iterator();iter.hasNext();){
        Map.Entry<Card,Person6> entry=iter.next();
            Card q=entry.getKey();
            Person6 w=entry.getValue();
            System.out.println(q+","+w);
            System.out.println(q.cardNo+","+w.name);

        }*/
//        自定义泛型
        /*private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Base26 g=new Base26();
        g.setObj("abcd");
        //抛出java.lang.ClassCastException 错误
//因为不知道Object 到底是什么类型
        Integer i=(Integer)g.getObj();
    }*/
//    自定泛型
    private String obj;
   /* public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }*/

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Base26<String> g=new Base26<String>();
        g.setObj("abcd");
        System.out.println(g.getObj());
    }
}


class Card{
    int cardNo;

    public Card(int cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNo == card.cardNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNo);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                '}';
    }
}
class Person6{
    String name;

    public Person6(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person6{" +
                "name='" + name + '\'' +
                '}';
    }
}