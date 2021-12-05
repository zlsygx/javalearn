import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//接受屏幕输入
public class Base35 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            String s=null;
            while ((s=br.readLine())!=null){
                System.out.println(s);
                //为q 退出循环
                if ("q".equals(s)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
