import java.lang.reflect.Array;

public class Base1 {
    public static void main(String[] args) {
//  声明一个字符
        char c1 ='a';
//  char占两个字节
        char c2 ='中';
        System.out.println(c1);
        System.out.println(c2);
//定义变量
        int age =100;
//        输出变量
        System.out.println(age);
//        正确，因为默认为double类型
        double b =10.5;
//        声明为float类型的变量
        float f =10.5f;
//       boolean类型只能取值为true和false
        boolean a = true;
        boolean c = false;
//        byte的范围不能够大于127
        byte e =20;
        short t =1000;
        int y =10000;
        int z =y++;
        System.out.println(z);
        System.out.println("z="+z);
        boolean opl=(10>5);
        System.out.println("opl="+opl);
        boolean op2=(10<5);
        System.out.println("op2="+op2);
        System.out.println("opl&&op2="+(op2 &&opl ));
        System.out.println("!opl="+!opl );
        int v=1;
        int m=2;
        v+=m;
        System.out.println(v);
        int z1=10;
        String y2=(z1>0?"正确":"错误");
        int z2=z1>0?1:-1;
        int old=3;
        if (old%2==0){
            System.out.println("是偶数");

        }
        System.out.println("是奇数");
        if (old >0 && old<=5){
            System.out.println("幼儿");
        }else if (old >5 && old <=10){
            System.out.println("儿童");
        }else if (old > 10 && old <=18){
            System.out.println("少年");
        }else if (old >18 && old <=30){
            System.out.println("青年");
        }else {
            System.out.println("壮年");
        }
        for (int j=0;j<100;j++){
            System.out.println(j);
        }
        XunHuan i =new XunHuan();
        i.m1();
    }

}
class XunHuan{
    public static void main(String[] args) {

    }
    public  void m1 (){
        char l='d';
        switch (l){
            case'd':
                System.out.println("优秀");
                break;
            case'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("一般");
                break;
            case'e':
                System.out.println("较差");
                break;
            default:
                System.out.println("太差了");


        }
        System.out.println("switch执行结束了");


    }
}
