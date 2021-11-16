import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

//日期类
public class Base16 {
    public static void main(String[] args) throws ParseException {
//        取得今天的日期
        Date today=new Date();
        System.out.println(today);
//        格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String a=sdf.format(today);
        System.out.println(a);
        String time="2021-11-15 22:40:11";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataTime=sdf2.parse(time);
        System.out.println(dataTime);
//        静态方法，类名.调用
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//        取得星期几
        Date d=new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-1");
        c.setTime(d);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//数字类
//        加入千分位，保留两位小数
        DecimalFormat df= new DecimalFormat("###,###,##");
        System.out.println(df.format(1234.56789));
//加入千分位保留4 位小数，不够补零
        System.out.println(new DecimalFormat("###,###.0000").format(2345.111));
        Random r=new Random();
        for (int i=0;i<5;i++){
            System.out.println(r.nextInt(100));
        }
        System.out.println(r.nextInt());
    }
}
