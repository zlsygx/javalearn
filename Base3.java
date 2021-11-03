import javax.swing.*;

public class Base3 {
//    1. 将 1~100 之间的奇数求和，需要采用+=来取得和；
public static void main(String[] args) {
    int sum =0;
    for (int i =0;i <=100; i++){
        if (i % 2 !=0){
            sum+=i;
        }
    }
    System.out.println(sum);
    int value =methord2(6);
    System.out.println(value);
    System.out.println("========================");
    int value2 = methord(5);
    System.out.println(value2);
//  分别采用递归和非递归的方式求 n 的阶乘：n！=n*(n-1)*….，其中 n 为大于 0 的整数，
//要求在控制台中输出 1 到 5 的阶乘

}
public static int methord(int a){
    if (a==1){
        return 1;
    }else {
        return a*methord(a-1);
    }
}
public static int methord2(int b){
        int sum2 =1;
        for (int i =1;i <=b;i++){
            sum2*=i;
        }
        return sum2;
}

}
