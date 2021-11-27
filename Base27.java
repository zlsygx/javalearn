import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//Java流概述
//文件通常是由一连串的字节或字符构成，组成文件的字节序列称为字节流，组成文件的字
//符序列称为字符流。Java 中根据流的方向可以分为输入流和输出流。输入流是将文件或其它
//输入设备的数据加载到内存的过程；输出流恰恰相反，是将内存中的数据保存到文件或其他
//输出设备
public class Base27 {
    public static void main(String[] args) {
//文件流
// FileInputStream(文件字节输入流)
        InputStream is=null;
        try {
            is=new FileInputStream("D:\\IntelliJ IDEA\\javase.iml");
            int b=0;
            while ((b=is.read())!=-1){
                //直接打印
                //System.out.print(b);
                //输出字符
                System.out.print((char)b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
