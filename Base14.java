import java.sql.SQLOutput;
import java.util.Arrays;

//Arrays工具类
public class Base14 {
    public static void main(String[] args) {
//       Arrays.sort的使用
        int[] data ={3,1,6,2,5};
        Arrays.sort(data);
        for (int i =0;i<data.length;i++){
            System.out.println(data[i]);
        }
        System.out.println("--------------------");
        for (int i=data.length-1;i>=0;i--){
            System.out.println(data[i]);
        }
//        Arrays.binarySearch的使用,快速找寻数据的下标是多少
        System.out.println("");
        int index=Arrays.binarySearch(data,3);
        System.out.println("infex="+index);
//        String String类是不可变类，也就是说String对象声明后，将不可修改
        String s1="a";
        String s2= "b";
        s1 =s1+s2;
        System.out.println(s1);
        String s="abc";
        String d="abc";
        String f=new String("abc");
        System.out.println(s==d);
        System.out.println(d==f);
        System.out.println(d.equals(f));
//        因为String 是不可变对象，如果多个字符串进行拼接，将会形成多个对象，这样可能会造成
//内存溢出，会给垃圾回收带来工作量，如下面的应用最好不要用String
        String q="";
        for (int i=0;i<100;i++){
            q+=i;
        }
        System.out.println(q);
//        正则表达式初步
        String w="asdd33dfsdaf33ddsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
//        将dd替换为“中”
        System.out.println(w.replaceAll("dd","中"));
        System.out.println(w.replaceAll("d{2}","中"));
//        将数字替换成中
        System.out.println(w.replaceAll("\\d","中"));
//        将非数字替换成中
        System.out.println(w.replaceAll("\\D","中"));


    }
}
