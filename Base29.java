import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//FileReader(文件字符输入流)
//FileReader 是一字符为单位读取文件，也就是一次读取两个字节，如：
public class Base29 {
    public static void main(String[] args) {
        Reader r=null;
        try {
            r=new FileReader("src\\Char\\zijie");
            int b=0;
            while ((b=r.read())!=-1){
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (r!=null){
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
