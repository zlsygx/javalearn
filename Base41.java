//实现Runnable接口
//其实Thread 对象本身就实现了Runnable 接口，但一般建议直接使用Runnable 接口来写多线
//程程序，因为接口会比类带来更多的好处
public class Base41 {
    public static void main(String[] args) {
        Runnable r1=new Processor1();
        Thread t1=new Thread(r1);
        t1.start();
        method();

    }
    private static void method(){
        System.out.println("=============methord()=============");
    }
}
class Processor1 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}