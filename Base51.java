//用户线程
public class Base51 {
    public static void main(String[] args) {
        Runnable r1=new Processor11();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
        }
        System.out.println("主线程结束！");

    }
}
class Processor11 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
        }
    }
}