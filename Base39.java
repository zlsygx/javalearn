import java.io.File;

//File 类
//File 提供了大量的文件操作：删除文件，修改文件，得到文件修改日期，建立目录、列表文
//件等等。
//如何递归读取目录及子目录下的文件
public class Base39 {
    public static void main(String[] args) {
listFlie(new File("D:\\IntelliJ IDEA\\javase"),0);
    }
    //递归读取某个目录及子目录下的所有文件
    private static void listFlie(File f, int level){
        String s="";
        for (int i=0;i<level;i++){
            s+="--";
        }
        File[] files=f.listFiles();
        for (int i=0;i<files.length;i++){
            System.out.println(s+files[i].getName());
            if (files[i].isDirectory()){
                listFlie(files[i],level+1);
            }
        }
    }
}
