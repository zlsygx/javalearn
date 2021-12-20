//为每一个线程创建一个对象来解决线程安全问题
public class Base50 {
    public static void main(String[] args) {
        Runnable r1=new Processor10();
        Thread t1=new Thread(r1,"t1");
        t1.start();

        //再次创建Processor 对象
        //每个线程拥有自己的对象
        Runnable r2=new Processor10();
        Thread t2=new Thread(r2,"t2");
        t2.start();
    }
}
class Processor10 implements Runnable{
    private int s=0;
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            s+=i;
        }
        System.out.println(Thread.currentThread().getName()+".s="+s);
        s=0;
    }
}