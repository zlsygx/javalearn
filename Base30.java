import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//FileWriter(文件字符输出流)
public class Base30 {
    public static void main(String[] args) {
        Writer w=null;
        try{
//            w=new FileWriter("zijie");
            //以下方式会将文件的内容进行覆盖
//            w=new FileWriter("src\\Char\\zijie");
//            w=new FileWriter("src\\Char\\zijie",false);
            //以下为true 表示，在文件后面追加
            w=new FileWriter("src\\Char\\zijie",true);
            w.write("你好你好！");
            w.write(123);
            //换行
            w.write("ln");
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (w != null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                /*try {
                    w.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        }

    }
}
