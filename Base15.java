//StringBuffer和 StringBuilder
//StringBuffer 称为字符串缓冲区，它的工作原理是：预先申请一块内存，存放字符序列，如
//果字符序列满了，会重新改变缓存区的大小，以容纳更多的字符序列。StringBuffer 是可变
//对象，这个是String 最大的不同
public class Base15 {
    public static void main(String[] args) {
       StringBuffer sbstr=new StringBuffer();
        for (int i=0;i<100;i++){
           sbstr.append(i).append(",");
//           sbstr.append(i);
//           拼串去除逗号
//           if (i!=99){
//               sbstr.append(",");
//           }
       }
//        可以输出
        System.out.println(sbstr);
        System.out.println("");
        System.out.println(sbstr.toString());
        System.out.println("");
//        去除逗号
        System.out.println(sbstr.toString().substring(0,sbstr.toString().length()-1));
        System.out.println("");
        System.out.println(sbstr.substring(0,sbstr.length()-1));
//        基本类型对应的包装类
        int i1=100;
        Integer i2=new Integer(i1);
        double i3=i2.doubleValue();
//        System.out.println(i3);
        String r=new String("123");
        int i4=Integer.parseInt(r);
//        System.out.println(i4);
        Integer i5=new Integer(r);
        System.out.println(i5);
        Integer i6=Integer.valueOf(r);

    }
}
