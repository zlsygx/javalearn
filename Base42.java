//线程的生命周期
//线程的生命周期存在五个状态：新建、就绪、运行、阻塞、死亡
//新建：采用new 语句创建完成
//就绪：执行start 后
//运行：占用CPU 时间
//阻塞：执行了wait 语句、执行了sleep 语句和等待某个对象锁，等待输入的场合
//终止：退出run()方法
//线程优先级
//线程优先级主要分三种： MAX_PRIORITY( 最高级);MIN_PRIORITY （ 最低级）
//NORM_PRIORITY(标准)默认
public class Base42 {
    public static void main(String[] args) {
        Runnable r1=new Processor2();
        Thread t1=new Thread(r1,"t1");
        //设置线程的优先级，线程启动后不能再次设置优先级
        //必须在启动前设置优先级
        //设置最高优先级
//        t1.setPriority(Thread.MAX_PRIORITY);
        //启动线程
        t1.start();
        //取得线程名称
//        System.out.println(t1.getName());
        Thread t2=new Thread(r1,"t2");
//        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
       System.out.println(Thread.currentThread().getName());
//        System.out.println(t2.getName());
    }
}
class Processor2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
        }
    }
}