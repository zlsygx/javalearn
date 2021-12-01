import java.io.*;

//缓冲流
//缓冲流主要是为了提高效率而存在的， 减少物理读取次数， 缓冲流主要有：
//BufferedInputStream 、BufferedOutputStream 、BufferedReader 、BufferedWriter ， 并且
//BufferedReader 提供了实用方法readLine()，可以直接读取一行，BufferWriter 提供了newLine()
//可以写换行符。
public class Base31 {
    public static void main(String[] args) {
        InputStream inp=null;
        OutputStream oup=null;
        try {
            inp=new BufferedInputStream(new FileInputStream("zijie"));
            oup=new BufferedOutputStream(new FileOutputStream("zijie1"));
            int b=0;
            while ((b=inp.read())!=-1){
                oup.write((char)b);
            }
            oup.flush();
            System.out.println("文件复制完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inp != null) {
                try {
                    inp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oup != null) {
                try {
                    oup.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
