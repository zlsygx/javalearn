import java.io.*;

//、完成屏幕打印的重定向
//System.out 其实对应的就是PrintStream，默认输出到控制台，我们可以重定向它的输出，可
//以定向到文件，也就是执行System.out.println(“hello”)不输出到屏幕，而输出到文件
public class Base34 {
    public static void main(String[] args) {
        OutputStream o=null;
        try {
            o=new FileOutputStream("zijie4");
            System.setOut(new PrintStream(o));
            System.out.println("asdfkjfd;lldffdfdrerere");
            System.out.println("完成！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (o != null) {
                try {
                    o.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
