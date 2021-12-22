//修改为守护（服务线程）线程
public class Base52 {
    public static void main(String[] args) {
    Runnable r1=new Processor12();
    Thread t1=new Thread(r1,"t1");
        //将当前线程修改为守护线程
        //在线程没有启动时可以修改以下参数
          t1.setDaemon(true);
          t1.start();
          for (int i=0;i<10;i++){
              System.out.println(Thread.currentThread().getName()+"."+i);
          }
        System.out.println("主线程结束！");
//设置为守护线程后，当主线程结束后，守护线程并没有把所有的数据输出完就结束了，也即
//是说守护线程是为用户线程服务的，当用户线程全部结束，守护线程会自动结束
    }
}
class Processor12 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
        }
    }
}