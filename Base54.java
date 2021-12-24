import java.util.Scanner;

//输出信息到控制台
public class Base54 {
    public static void main(String[] args) {
// 创建一个键盘扫描器对象
        Scanner s=new Scanner(System.in);
// 接收用户的输入
        int i=s.nextInt();
        System.out.println("你输入的数字是："+i);
// 代码执行到此处会停下来等待用户的输入
        int j=s.nextInt();
        System.out.println("您输入的数字是："+j);
        String a=s.next();
        System.out.println("你输入了："+a);
        System.out.println("欢迎使用小型迷你计算器");
        System.out.print("请输入第一个数字：");
        int q=s.nextInt();
        System.out.print("请输入第二个数字：");
        int w=s.nextInt();
        System.out.println(q+"+"+w+"="+(q+w));
    }
}
