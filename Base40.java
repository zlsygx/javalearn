//线程的创建和启动
//继承Thread类
public class Base40 {
    public static void main(String[] args) {
        Processor p=new Processor();
        //手动调用该方法
//不能采用run 来启动一个场景（线程），
//run 就是一个普通方法调用
//p.run();
//采用start 启动线程，不是直接调用run
//start 不是马上执行线程，而是使线程进入就绪
//线程的正真执行是由Java 的线程调度机制完成的
//        p.start();
//只能启动一次
        p.start();
        methord1();

    }
    private static void methord1(){
        System.out.println("----------method1-----------");
    }
}
   /* private static void methord1(){
        System.out.println("----------method1-----------");
    }
}
class Processor{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }*/
// 以上顺序输出相应的结果（属于串行），也就是run 方法完全执行完成后，才执行method1
//方法，也就是method1 必须等待前面的方法返回才可以得到执行，这是一种“同步编程模型”
//    }
//}


//    使用线程
class Processor extends Thread{
    //覆盖Thread 中的run 方法，该方法没有异常
//该方法是由java 线程掉机制调用的
//我们不应该手动调用该方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
//通过输出结果大家会看到，没有顺序执行，而在输出数字的同时执行了method1()方法，如
//果从效率上看，采用多线程的示例要快些，因为我们可以看作他是同时执行的，mthod1()
//方法没有等待前面的操作完成才执行，这叫“异步编程模型”