
public class Base9 {
    public static void main(String[] args) {
    try {
        method1(10,0);

    } catch (MyException e) {
        System.out.println(e.getMessage());
    }
    }
    private static void method1(int value1,int value2)  {
        if (value2==0){//如果是受控異常必須聲明
            throw new MyException("除數為0");
        }
        int value3 =value1/value2;
        System.out.println(value3);
    }

  /*  private static void method1(int value1,int value2) throws MyException {
        if (value2==0){//如果是受控異常必須聲明
            throw new MyException("除數為0");
        }
        int value3 =value1/value2;
        System.out.println(value3);
    }*/
}


/*
//自定義受控異常
class MyException extends Exception{
    public MyException(){
//        調用父類的默認構造函數
//        super();
    }
    public MyException(String message){
//        手動調用父類的構造方法
        super(message);
    }
}*/
//自定义非受控异常
class MyException extends RuntimeException{
    public MyException(){

        super();
        super.printStackTrace();
    }

    public MyException(String message) {
        super(message);
    }
}
