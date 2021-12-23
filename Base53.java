import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//Timer定时器
public class Base53 {
    /*public static void main(String[] args) throws ParseException {
        Timer t=new Timer();
        Date firstDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-02-20 15:23:10");
        t.schedule(new MyTimerTask(),firstDate,1000*60*60*24);

    }
}
class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(new Date());
    }*/
    public static void main(String[] args) throws ParseException {
        Timer t=new Timer();
        Date firstDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-02-20 15:23:10");
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        },firstDate,1000*60*60*24);
    }
}
//以上程序在2010-02-20 15:23:10 会输出，每个24 小时输出一次
//采用匿名类实现以上功能
