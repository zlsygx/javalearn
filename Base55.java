import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Base55 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("请输入年龄：");
        int a=s.nextInt();
       /* if (a<0||a>120){
            System.out.println("对不起，年龄值不合法！");
        }else {
            if (a<=5){
                System.out.println("婴幼儿");
            }else if (a<=10){
                System.out.println("少儿");
            }else if (a<=10) {
                System.out.println("少儿");
            }else if (a<=18) {
                System.out.println("少年");
            }else if (a<=35) {
                System.out.println("青年");
            }else
                System.out.println("老年");

        }*/
//        进一步改良
        String str="老年";
        if(a<0||a>120){
            System.out.println("对不起，年龄值不合法！");
        }else if (a<5){
            str="婴幼儿";
        }else if (a<10){
            str="少儿";
        }else if (a<18){
            str="少年";
        }else if (a<30){
            str="青年";
        }else if (a<45){
            str="中年";
        }
        System.out.println(str);
//    题目系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级
//    Scanner d=new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        double score=s.nextDouble();
        String chengji="优秀";
        if (score<0||score>100){
            chengji="对不起，输入的成绩不合法！";
        }else if (score<60){
            chengji="不及格";
        }else if (score<70){
            chengji="及格";
        } else if (score < 80) {
            chengji="良好";
        } else if (score < 90) {
            chengji="不错";
        }
        System.out.println(chengji);

    }
}
