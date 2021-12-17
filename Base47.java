//如何正确的停止一个线程
//通常定义一个标记，来判断标记的状态停止线程的执行
public class Base47 {
    public static void main(String[] args) {
    Runnable r1=new Processor7();
    Thread t1=new Thread(r1,"t1");
    t1.start();
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //停止线程
        Processor7 p=(Processor7)r1;
        p.setFlag(true);
    }
}
class Processor7 implements Runnable{

    //线程停止标记，true 为停止
    private boolean flag;
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"."+i);
            //为true 停止线程执行
            if (flag){
                break;
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}