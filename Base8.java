import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//public class Base8 {
//    public static void main(String[] args) {
//        int i =100;
//        int j =0;
//        try {
//            int m=i/j;
//            System.out.println(m);
//
//        }catch (Exception e){
//            System.out.println("被0除了");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("=======================");
//    }
//}
class ExcepttionTest {
    /*public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
    }

    private static void method2() {
        int i =100;
        int j =0;
        try {
            int m=i/j;
            System.out.println(m);

        }catch (Exception e){
//            通过printStackTrace可以打印栈结构
            e.printStackTrace();

        }
    }*/
    public static void main(String[] args) {
      /* try {
           FileInputStream fi =new FileInputStream("Base8.java");
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }*/
       /* try {
            FileInputStream fi = new FileInputStream("Base8.java");
            System.out.println("-----------before fi.close--------------");
            fi.close();
            System.out.println("-----------after fi.close--------------");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println("===================================");
       /* FileInputStream fis =null;
        try {
            fis =new FileInputStream("Base8.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                System.out.println("-----------before fi.close--------------");
                fis.close();
                System.out.println("-----------after fi.close--------------");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*int i =100;
        int j =0;
        try {
            int m=i/j;
            System.out.println(m);
            return;
    }catch (ArithmeticException ae) {
            ae.printStackTrace();
        }finally {
            System.out.println("-----------会执行么----------------");
        }*/
        System.out.println("---------------------------------------");
        /*int i =100;
        int j =0;
        try {
            int m=i/j;
            System.out.println(m);
//            return;
            System.exit(-1);//java 虚拟机退出
        }catch (ArithmeticException ae) {
            ae.printStackTrace();
        }finally {
            System.out.println("-----------会执行么----------------");
        }*/
        int r =method1();
        System.out.println(r);
    }
        private static int method1(){
            int a =10;
            try {
//             return a;
                a =50;
            }finally {
                a =100;
//                System.out.println(a);
            }
            System.out.println(a);
            System.out.println("---");
           return a;

        }

}