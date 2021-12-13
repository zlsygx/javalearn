//、Thread.sleep
//sleep 设置休眠的时间,单位毫秒，当一个线程遇到sleep 的时候，就会睡眠，进入到阻塞状
//态,放弃CPU，腾出cpu 时间片，给其他线程用，所以在开发中通常我们会这样做，使其他
//的线程能够取得CPU 时间片，当睡眠时间到达了，线程会进入可运行状态，得到CPU 时间
//片继续执行，如果线程在睡眠状态被中断了，将会抛出IterruptedException
public class Base43 {
    public static void main(String[] args) {
        Runnable r1=new Processor3();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        Thread t2=new Thread(r1,"t2");
        t2.start();

    }
}
class Processor3 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
            if (i%10==0){
                try {
//睡眠100 毫秒，主要是放弃CPU 的使用，将CPU 时间片交给其他线程使用
                  Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}