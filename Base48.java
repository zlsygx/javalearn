//线程的同步（加锁）
//取得0~10 的和采用相同的线程对象启用两个线程进行计算（共享一个对象启动两个线程）
public class Base48 {
    public static void main(String[] args) {
        Runnable r1=new Processor8();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        Thread t2=new Thread(r1,"t2");
        t2.start();

    }
}
/*class Processor8 implements Runnable{

    @Override
    public void run() {
        //定义局部变量s，作为累加变量
        int s=0;
        for (int i=0;i<10;i++){
            s+=i;
        }
        System.out.println(Thread.currentThread().getName()+".s="+s);
    }
}*/
//以上t1 和t2 并发执行，s 为每个线程的局部变量，位于各自的栈帧中，因为栈帧中的数据
//是不会互相干扰的，所有计算结果都为45
class Processor8 implements Runnable{
    //定义成员变量s，作为累加变量
    private int s=0;

    @Override
    public void run() {

        for (int i=0;i<10;i++){
            s+=i;
        }
        System.out.println(Thread.currentThread().getName()+".s="+s);
    }
}
//为什么出现以上的问题，因为共享了同一个对象的成员变量s，两个线程同时对其进行操作，
//所以产生了问题，此时称为此时Processor 为线程不安全的，如果想得到正确的结果，必须
//采用线程同步，加锁，该变量不能共享使用
//t2.s=90
//t1.s=45