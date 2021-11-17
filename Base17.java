import java.sql.SQLOutput;

// 枚举类
//补充 public static void main(String[] args)，数组如
//何传值
public class Base17 {
    public static void main(String[] args) {
       /* Result r=methoda(10,5);
        if (r==Result.SUCCESS){
            System.out.println("成功！");
            }
        if (r==Result.FAILURE){
            System.out.println("失败！");
        }
        System.out.println("========================");*/
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        if (args.length!=0){
            if (args[0].equals("A")){
                System.out.println("添加用户");
            }
            if (args[0].equals("B")){
                System.out.println("更新用户");
            }else {
                System.out.println("请输入参数A：添加，B：修改");
            }
        }

    }
//    正确返回SUCESS,错误返回FAILURE.
   /* private static Result methoda(int a,int b){
    try{
        int v=a/b;
        return Result.SUCCESS;
    }catch (Exception e){
        return Result.FAILURE;
    }
    }
}
enum Result{
    SUCCESS,FAILURE*/
}

