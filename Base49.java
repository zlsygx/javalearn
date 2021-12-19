//使用线程同步
//线程同步，指某一个时刻，指允许一个线程来访问共享资源，线程同步其实是对对象加锁，
//如果对象中的方法都是同步方法，那么某一时刻只能执行一个方法，采用线程同步解决以上
//的问题，我们只要保证线程一操作s 时，线程2 不允许操作即可，只有线程一使用完成s 后，
//再让线程二来使用s 变量
public class Base49 {
    public static void main(String[] args) {
        Runnable r1=new Processor9();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        Thread t2=new Thread(r1,"t2");
        t2.start();
    }
}
class Processor9 implements Runnable {
    //定义成员变量s，作为累加变量
    private int s = 0;

    /*@Override
     */
    public  void run() {
        //使用同步块
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                s += i;

            }
            System.out.println(Thread.currentThread().getName() + ".s=" + s);
            s = 0;
        }
    }
}