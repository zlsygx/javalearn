//t.join（成员方法）
//当前线程可以调用另一个线程的join 方法，调用后当前线程会被阻塞不再执行，直到被调
//用的线程执行完毕，当前线程才会执行
public class Base45 {
    public static void main(String[] args) {
        Runnable r1=new Processor5();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==================main end===============");

    }
}
class Processor5 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
        }
    }
}