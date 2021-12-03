import java.io.*;

//转换流
//转换流主要有两个InputStreamReader 和OutputStreamWriter
//􀁺 InputStreamReader 主要是将字节流输入流转换成字符输入流
//􀁺 OutputStreamWriter 主要是将字节流输出流转换成字符输出流
public class Base33 {
    public static void main(String[] args) {
        BufferedReader r=null;
        try {
            r=new BufferedReader(new InputStreamReader(new FileInputStream("zijie")));
            String s=null;
            if ((s=r.readLine())!=null){
                System.out.println(s);
                r.readLine();
                System.out.println(s);
            }
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
//OutputStreamWriter
                BufferedWriter w=null;
                try {
                    w=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ZIJIE3")));
                    w.write("我是一个中国人！");
                    w.newLine();
                    w.write("我自豪！");
                    w.flush();
                    System.out.println("写入成功！");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
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
}
