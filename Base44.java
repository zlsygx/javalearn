//Thread.yield、
//它与sleep()类似，只是不能由用户指定暂停多长时间，并且yield()方法只能让同优先级的线
//程有执行的机会
public class Base44 {
    public static void main(String[] args) {
        Runnable r1=new Processor4();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        Thread t2=new Thread(r1,"t2");
        t2.start();

    }

}
class Processor4 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
            if (i%10==0){
                System.out.println("---------------------");
                //采用yieid 可以将CPU 的使用权让给同一个优先级的线程
                Thread.yield();
            }
        }
    }
}