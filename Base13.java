//数组的排序
public class Base13 {
//冒泡排序
public static void main(String[] args) {
//    创建一个int类型的数组
    int[] data ={1,5,9,3,10,8};
    for (int i =data.length-1;i >0;i--){
        for (int j =0;j <i;j++){
            if (data[j] >data[j+1]){
                int temp =data[j];
                data[j] =data[j+1];
                data[j+1] =temp;
            }
        }
    }
    /*for (int a:data){
        System.out.println(a);*/
    for (int i =0;i<data.length;i++){
        System.out.println(data[i]);
    }
    System.out.println("========================");
//    选择排序
    int[] data2 ={1,5,9,3,10,8,6};
    for (int i =0;i<data2.length-1;i++){
        int min =i;
        for (int j=i+1;j<data2.length;j++){
            if (data2[j]<data2[min]){
                min =j;
            }
        }
//        进行位置的交换
        if (min!=i){
            int temp =data2[i];
            data2[i]=data2[min];
            data2[min]=temp;
        }
    }
    for(int i=0;i <data2.length;i++){
        System.out.println(data2[i]);
    }
    System.out.println("----------------------");
//    数组的搜索
    int[] data3 ={1,2,3,4,5,6,7,8,9,10};
    int index=binarySearch(data3,6);
    System.out.println(index);

}
    public static int binarySearch(int[] data,int value){
//    开始下标
        int begin =0;
//        结束下标
        int end =data.length-1;
        while (begin<=end){
            int mid =(begin+end)/2;
            if (data[mid]==value){
                return mid;
            }else if (data[mid]>value){
                end=mid-1;
            }else if (data[mid]<value){
                begin=mid-1;
            }

        }
         return -1;
    }
}

