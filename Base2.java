import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Base2 {
    private int m;
    boolean l;
    public static void main(String[] args) {
//        while语句

        float i =1.1f;
        while (i <= 10){
            System.out.printf("%2d %.5f \n",1,i);
            i++;
        }
        for (int j=1;j<=10;){
            System.out.println(j);
            j++;
        }
        int m =1;
        do {
            System.out.println("算法"+m);
            m++;

        }while (m<20);
//        break语句，会跳出当前循环
        for (i=1;i<100;i++){
            System.out.printf("%f\n",i);
            if (i>80){
                break;
            }
        }
        for (int q=0;q <4;q++){
            System.out.println("q=============="+q);
            for (int w=1;w<10;w++){
                System.out.println(w);
                if (w==8){
                    break;
                }
            }
        }
        System.out.println("--------------------------");
        for (int e =1;e <=100;e++){
            if (e % 2!=0){
                System.out.println(e);
             if (e % 2==0){
             continue;
             }
            }
        }
        String r =methord1(1);
        System.out.println(r);
        System.out.println("================================");
        int k =methord2(6);
        System.out.println(k);
    }

    private static int methord2(int i) {
        if (i==1){
            return  1;
    }else {
            return i+methord2(i-1);
        }

}

    public static String methord1(int t) {
        String retValue ="";
        switch (t){
            case 1:
                System.out.println("优秀");
                retValue ="优";
                break;
            case 2:
                System.out.println("良好");
                retValue ="良好";
                break;
            case 3:
                System.out.println("一般");
                retValue ="一般";
                break;
            case 4:
                System.out.println("很差");
                retValue ="很差";
                break;
        }
        return retValue;
    }

    public Base2() {
    }

    public Base2(int m, boolean l) {
        this.m = m;
        this.l = l;
    }

    public int getM() {
        return m;
    }

    public boolean isL() {
        return l;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setL(boolean l) {
        this.l = l;
    }

}
