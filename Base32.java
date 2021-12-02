import java.io.*;
import java.nio.Buffer;

//采用字符缓冲流改造文件复制代码
public class Base32 {
    public static void main(String[] args) {
        BufferedReader r=null;
        BufferedWriter w=null;
        try {
            r=new BufferedReader(new FileReader("zijie1"));
            w=new BufferedWriter(new FileWriter("zijie2"));
            String b=null;
            if ((b=r.readLine())!=null){
                w.write(b);
                w.newLine();
                w.write(b);
            }
            w.flush();
            System.out.println("文件复制完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (w != null) {
                    try {
                        w.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }

    }
}
