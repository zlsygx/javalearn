import java.io.*;

//FileOutputStream(文件字节输出流)
//FileOutputStream 主要按照字节方式写文件，例如：我们做文件的复制，首先读取文件，读
//取后在将该文件另写一份保存到磁盘上，这就完成了备份
public class Base28 {
    public static void main(String[] args) {
        InputStream ins=null;
        OutputStream ous=null;
        try {
            ins=new FileInputStream("D:\\IntelliJ IDEA\\老杜Java资料\\IDEA重要知识点讲解.txt");
            ous=new FileOutputStream("D:\\IntelliJ IDEA\\老杜Java资料\\新建文件夹\\IDEA重要知识点讲解1.txt");
            int b=0;
            while ((b=ins.read())!=-1){
               ous.write(b);
            }
            System.out.println("文件复制完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ins!=null){
                    ins.close();
                }
                if (ous!=null){
                    ous.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
