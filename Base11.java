//数组的创建
public class Base11 {
    public static void main(String[] args) {
//        声明int类型的数组，长度为5
//        数组中的元素必须为int类型
        int[] data =new int[5];
//        如何赋值，下标从0开始
        data[0] =1;
        data[1] =2;
        data[2] =3;
        data[3] =4;
        data[4] =5;
//        输出数组中的元素
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        System.out.println(data.length);
        System.out.println("===========================");
        for (int i =0;i <data.length;i++){
            System.out.println(data[i]);
        }
        System.out.println("------------------------");
        for (int arr:data){
            System.out.println(arr);
        }
//        输出指定的数组元素
        System.out.println("data[3]="+data[3]);
    }
}
