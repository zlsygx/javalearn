//interrupt（中断）
//如果我们的线程正在睡眠，可以采用interrupt 进行中断
public class Base46 {
    public static void main(String[] args) {
        Runnable r1=new Processor6();
        Thread t1=new Thread(r1,"t1");
        t1.start();
        try {
            //设置为500 毫秒，没有出现中断异常，因为
            //500 毫秒之后再次调用t1.interrupt()时，
            //此时的睡眠线程已经执行完成
            //如果sleep 的时间设置的小一些，会出现中断异常，
            //因为存在睡眠线程
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断睡眠中的线程
        t1.interrupt();

    }
}
class Processor6 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
            if (i%50==0){
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println("===========中断===========");
                    break;
                }
            }
        }
    }
}